package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.MinimalExternalModuleDependency;
import org.gradle.plugin.use.PluginDependency;
import org.gradle.api.artifacts.ExternalModuleDependencyBundle;
import org.gradle.api.artifacts.MutableVersionConstraint;
import org.gradle.api.provider.Provider;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.internal.catalog.AbstractExternalDependencyFactory;
import org.gradle.api.internal.catalog.DefaultVersionCatalog;
import java.util.Map;
import javax.inject.Inject;

/**
 * A catalog of dependencies accessible via the `libs` extension.
*/
@NonNullApi
public class LibrariesForLibs extends AbstractExternalDependencyFactory {

    private final AbstractExternalDependencyFactory owner = this;
    private final AndroidxLibraryAccessors laccForAndroidxLibraryAccessors = new AndroidxLibraryAccessors(owner);
    private final ComposeLibraryAccessors laccForComposeLibraryAccessors = new ComposeLibraryAccessors(owner);
    private final CoroutinesLibraryAccessors laccForCoroutinesLibraryAccessors = new CoroutinesLibraryAccessors(owner);
    private final GradleLibraryAccessors laccForGradleLibraryAccessors = new GradleLibraryAccessors(owner);
    private final KoinLibraryAccessors laccForKoinLibraryAccessors = new KoinLibraryAccessors(owner);
    private final RichtextLibraryAccessors laccForRichtextLibraryAccessors = new RichtextLibraryAccessors(owner);
    private final VersionAccessors vaccForVersionAccessors = new VersionAccessors(providers, config);
    private final BundleAccessors baccForBundleAccessors = new BundleAccessors(providers, config);
    private final PluginAccessors paccForPluginAccessors = new PluginAccessors(providers, config);

    @Inject
    public LibrariesForLibs(DefaultVersionCatalog config, ProviderFactory providers) {
        super(config, providers);
    }

        /**
         * Creates a dependency provider for appcompat (androidx.appcompat:appcompat)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAppcompat() { return create("appcompat"); }

        /**
         * Creates a dependency provider for commonsLang (org.apache.commons:commons-lang3)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCommonsLang() { return create("commonsLang"); }

        /**
         * Creates a dependency provider for composePreferences (com.github.Sh4dowSoul.ComposePreferences:preferences-material)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getComposePreferences() { return create("composePreferences"); }

        /**
         * Creates a dependency provider for linkifyText (com.github.firefinchdev:linkify-text)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getLinkifyText() { return create("linkifyText"); }

        /**
         * Creates a dependency provider for markdownView (us.feras.mdv:markdownview)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getMarkdownView() { return create("markdownView"); }

        /**
         * Creates a dependency provider for material (com.google.android.material:material)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getMaterial() { return create("material"); }

        /**
         * Creates a dependency provider for sqldelight (com.squareup.sqldelight:android-driver)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getSqldelight() { return create("sqldelight"); }

        /**
         * Creates a dependency provider for supportv4 (androidx.legacy:legacy-support-v4)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getSupportv4() { return create("supportv4"); }

        /**
         * Creates a dependency provider for systemuicontroller (com.google.accompanist:accompanist-systemuicontroller)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getSystemuicontroller() { return create("systemuicontroller"); }

    /**
     * Returns the group of libraries at androidx
     */
    public AndroidxLibraryAccessors getAndroidx() { return laccForAndroidxLibraryAccessors; }

    /**
     * Returns the group of libraries at compose
     */
    public ComposeLibraryAccessors getCompose() { return laccForComposeLibraryAccessors; }

    /**
     * Returns the group of libraries at coroutines
     */
    public CoroutinesLibraryAccessors getCoroutines() { return laccForCoroutinesLibraryAccessors; }

    /**
     * Returns the group of libraries at gradle
     */
    public GradleLibraryAccessors getGradle() { return laccForGradleLibraryAccessors; }

    /**
     * Returns the group of libraries at koin
     */
    public KoinLibraryAccessors getKoin() { return laccForKoinLibraryAccessors; }

    /**
     * Returns the group of libraries at richtext
     */
    public RichtextLibraryAccessors getRichtext() { return laccForRichtextLibraryAccessors; }

    /**
     * Returns the group of versions at versions
     */
    public VersionAccessors getVersions() { return vaccForVersionAccessors; }

    /**
     * Returns the group of bundles at bundles
     */
    public BundleAccessors getBundles() { return baccForBundleAccessors; }

    /**
     * Returns the group of plugins at plugins
     */
    public PluginAccessors getPlugins() { return paccForPluginAccessors; }

    public static class AndroidxLibraryAccessors extends SubDependencyFactory {

        public AndroidxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for activity (androidx.activity:activity-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getActivity() { return create("androidx.activity"); }

            /**
             * Creates a dependency provider for core (androidx.core:core-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() { return create("androidx.core"); }

            /**
             * Creates a dependency provider for datastore (androidx.datastore:datastore-preferences)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getDatastore() { return create("androidx.datastore"); }

            /**
             * Creates a dependency provider for preference (androidx.preference:preference-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPreference() { return create("androidx.preference"); }

    }

    public static class ComposeLibraryAccessors extends SubDependencyFactory {
        private final ComposeMaterialLibraryAccessors laccForComposeMaterialLibraryAccessors = new ComposeMaterialLibraryAccessors(owner);
        private final ComposeUiLibraryAccessors laccForComposeUiLibraryAccessors = new ComposeUiLibraryAccessors(owner);

        public ComposeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for activity (androidx.activity:activity-compose)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getActivity() { return create("compose.activity"); }

            /**
             * Creates a dependency provider for foundation (androidx.compose.foundation:foundation)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getFoundation() { return create("compose.foundation"); }

            /**
             * Creates a dependency provider for koin (io.insert-koin:koin-androidx-compose)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKoin() { return create("compose.koin"); }

            /**
             * Creates a dependency provider for viewmodel (androidx.lifecycle:lifecycle-viewmodel-compose)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getViewmodel() { return create("compose.viewmodel"); }

        /**
         * Returns the group of libraries at compose.material
         */
        public ComposeMaterialLibraryAccessors getMaterial() { return laccForComposeMaterialLibraryAccessors; }

        /**
         * Returns the group of libraries at compose.ui
         */
        public ComposeUiLibraryAccessors getUi() { return laccForComposeUiLibraryAccessors; }

    }

    public static class ComposeMaterialLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public ComposeMaterialLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for material (androidx.compose.material:material)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("compose.material"); }

            /**
             * Creates a dependency provider for icons (androidx.compose.material:material-icons-extended)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getIcons() { return create("compose.material.icons"); }

    }

    public static class ComposeUiLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final ComposeUiToolingLibraryAccessors laccForComposeUiToolingLibraryAccessors = new ComposeUiToolingLibraryAccessors(owner);

        public ComposeUiLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ui (androidx.compose.ui:ui)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("compose.ui"); }

        /**
         * Returns the group of libraries at compose.ui.tooling
         */
        public ComposeUiToolingLibraryAccessors getTooling() { return laccForComposeUiToolingLibraryAccessors; }

    }

    public static class ComposeUiToolingLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public ComposeUiToolingLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for tooling (androidx.compose.ui:ui-tooling)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("compose.ui.tooling"); }

            /**
             * Creates a dependency provider for preview (androidx.compose.ui:ui-tooling-preview)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPreview() { return create("compose.ui.tooling.preview"); }

    }

    public static class CoroutinesLibraryAccessors extends SubDependencyFactory {

        public CoroutinesLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for android (org.jetbrains.kotlinx:kotlinx-coroutines-android)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAndroid() { return create("coroutines.android"); }

            /**
             * Creates a dependency provider for core (org.jetbrains.kotlinx:kotlinx-coroutines-core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() { return create("coroutines.core"); }

            /**
             * Creates a dependency provider for sqldelight (com.squareup.sqldelight:coroutines-extensions)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getSqldelight() { return create("coroutines.sqldelight"); }

    }

    public static class GradleLibraryAccessors extends SubDependencyFactory {

        public GradleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for android (com.android.tools.build:gradle)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAndroid() { return create("gradle.android"); }

            /**
             * Creates a dependency provider for kotlin (org.jetbrains.kotlin:kotlin-gradle-plugin)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKotlin() { return create("gradle.kotlin"); }

            /**
             * Creates a dependency provider for sqldelight (com.squareup.sqldelight:gradle-plugin)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getSqldelight() { return create("gradle.sqldelight"); }

    }

    public static class KoinLibraryAccessors extends SubDependencyFactory {

        public KoinLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for android (io.insert-koin:koin-android)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAndroid() { return create("koin.android"); }

            /**
             * Creates a dependency provider for core (io.insert-koin:koin-core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() { return create("koin.core"); }

    }

    public static class RichtextLibraryAccessors extends SubDependencyFactory {

        public RichtextLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for commonmark (com.halilibo.compose-richtext:richtext-commonmark)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCommonmark() { return create("richtext.commonmark"); }

            /**
             * Creates a dependency provider for printing (com.halilibo.compose-richtext:printing)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPrinting() { return create("richtext.printing"); }

    }

    public static class VersionAccessors extends VersionFactory  {

        private final AndroidVersionAccessors vaccForAndroidVersionAccessors = new AndroidVersionAccessors(providers, config);
        private final AndroidxVersionAccessors vaccForAndroidxVersionAccessors = new AndroidxVersionAccessors(providers, config);
        private final NotepadVersionAccessors vaccForNotepadVersionAccessors = new NotepadVersionAccessors(providers, config);
        public VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: accompanist (0.23.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAccompanist() { return getVersion("accompanist"); }

            /**
             * Returns the version associated to this alias: appcompat (1.4.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAppcompat() { return getVersion("appcompat"); }

            /**
             * Returns the version associated to this alias: commonsLang (3.12.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCommonsLang() { return getVersion("commonsLang"); }

            /**
             * Returns the version associated to this alias: compose (1.1.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCompose() { return getVersion("compose"); }

            /**
             * Returns the version associated to this alias: composePreferences (0.1.4)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getComposePreferences() { return getVersion("composePreferences"); }

            /**
             * Returns the version associated to this alias: coroutines (1.6.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCoroutines() { return getVersion("coroutines"); }

            /**
             * Returns the version associated to this alias: koin (3.2.0-beta-1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKoin() { return getVersion("koin"); }

            /**
             * Returns the version associated to this alias: kotlin (1.6.10)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKotlin() { return getVersion("kotlin"); }

            /**
             * Returns the version associated to this alias: linkifyText (0a45dbcf9b)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getLinkifyText() { return getVersion("linkifyText"); }

            /**
             * Returns the version associated to this alias: markdownView (1.1.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getMarkdownView() { return getVersion("markdownView"); }

            /**
             * Returns the version associated to this alias: material (1.5.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getMaterial() { return getVersion("material"); }

            /**
             * Returns the version associated to this alias: richtext (0.11.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getRichtext() { return getVersion("richtext"); }

            /**
             * Returns the version associated to this alias: sqldelight (1.5.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getSqldelight() { return getVersion("sqldelight"); }

            /**
             * Returns the version associated to this alias: supportv4 (1.0.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getSupportv4() { return getVersion("supportv4"); }

            /**
             * Returns the version associated to this alias: versionsPlugin (0.42.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVersionsPlugin() { return getVersion("versionsPlugin"); }

        /**
         * Returns the group of versions at versions.android
         */
        public AndroidVersionAccessors getAndroid() { return vaccForAndroidVersionAccessors; }

        /**
         * Returns the group of versions at versions.androidx
         */
        public AndroidxVersionAccessors getAndroidx() { return vaccForAndroidxVersionAccessors; }

        /**
         * Returns the group of versions at versions.notepad
         */
        public NotepadVersionAccessors getNotepad() { return vaccForNotepadVersionAccessors; }

    }

    public static class AndroidVersionAccessors extends VersionFactory  {

        public AndroidVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: android.compileSdk (31)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCompileSdk() { return getVersion("android.compileSdk"); }

            /**
             * Returns the version associated to this alias: android.gradlePlugin (7.1.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getGradlePlugin() { return getVersion("android.gradlePlugin"); }

            /**
             * Returns the version associated to this alias: android.minSdk (21)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getMinSdk() { return getVersion("android.minSdk"); }

            /**
             * Returns the version associated to this alias: android.targetSdk (31)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getTargetSdk() { return getVersion("android.targetSdk"); }

    }

    public static class AndroidxVersionAccessors extends VersionFactory  {

        public AndroidxVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: androidx.activity (1.4.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getActivity() { return getVersion("androidx.activity"); }

            /**
             * Returns the version associated to this alias: androidx.core (1.7.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCore() { return getVersion("androidx.core"); }

            /**
             * Returns the version associated to this alias: androidx.datastore (1.0.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getDatastore() { return getVersion("androidx.datastore"); }

            /**
             * Returns the version associated to this alias: androidx.lifecycle (2.4.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getLifecycle() { return getVersion("androidx.lifecycle"); }

            /**
             * Returns the version associated to this alias: androidx.preference (1.2.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getPreference() { return getVersion("androidx.preference"); }

    }

    public static class NotepadVersionAccessors extends VersionFactory  {

        public NotepadVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: notepad.versionCode (112)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVersionCode() { return getVersion("notepad.versionCode"); }

            /**
             * Returns the version associated to this alias: notepad.versionName (2.3.7)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVersionName() { return getVersion("notepad.versionName"); }

    }

    public static class BundleAccessors extends BundleFactory {

        public BundleAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a dependency bundle provider for androidx which is an aggregate for the following dependencies:
             * <ul>
             *    <li>androidx.activity:activity-ktx</li>
             *    <li>androidx.core:core-ktx</li>
             *    <li>androidx.datastore:datastore-preferences</li>
             *    <li>androidx.preference:preference-ktx</li>
             * </ul>
             * This bundle was declared in catalog libs.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getAndroidx() { return createBundle("androidx"); }

            /**
             * Creates a dependency bundle provider for compose which is an aggregate for the following dependencies:
             * <ul>
             *    <li>androidx.activity:activity-compose</li>
             *    <li>androidx.compose.foundation:foundation</li>
             *    <li>io.insert-koin:koin-androidx-compose</li>
             *    <li>androidx.compose.material:material</li>
             *    <li>androidx.compose.material:material-icons-extended</li>
             *    <li>androidx.compose.ui:ui</li>
             *    <li>androidx.compose.ui:ui-tooling-preview</li>
             *    <li>androidx.lifecycle:lifecycle-viewmodel-compose</li>
             * </ul>
             * This bundle was declared in catalog libs.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getCompose() { return createBundle("compose"); }

            /**
             * Creates a dependency bundle provider for coroutines which is an aggregate for the following dependencies:
             * <ul>
             *    <li>org.jetbrains.kotlinx:kotlinx-coroutines-android</li>
             *    <li>org.jetbrains.kotlinx:kotlinx-coroutines-core</li>
             *    <li>com.squareup.sqldelight:coroutines-extensions</li>
             * </ul>
             * This bundle was declared in catalog libs.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getCoroutines() { return createBundle("coroutines"); }

            /**
             * Creates a dependency bundle provider for koin which is an aggregate for the following dependencies:
             * <ul>
             *    <li>io.insert-koin:koin-android</li>
             *    <li>io.insert-koin:koin-core</li>
             * </ul>
             * This bundle was declared in catalog libs.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getKoin() { return createBundle("koin"); }

            /**
             * Creates a dependency bundle provider for richtext which is an aggregate for the following dependencies:
             * <ul>
             *    <li>com.halilibo.compose-richtext:richtext-commonmark</li>
             *    <li>com.halilibo.compose-richtext:printing</li>
             * </ul>
             * This bundle was declared in catalog libs.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getRichtext() { return createBundle("richtext"); }

    }

    public static class PluginAccessors extends PluginFactory {

        public PluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

    }

}