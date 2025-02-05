package jp.takuji31.compose.navigation.compiler

import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.MemberName

// region Navigation
val NavGraphBuilder = ClassName.bestGuess("androidx.navigation.NavGraphBuilder")
val NavType = ClassName.bestGuess("androidx.navigation.NavType")
val NavDeepLink = ClassName.bestGuess("androidx.navigation.NavDeepLink")
val NamedNavArgument = ClassName.bestGuess("androidx.navigation.NamedNavArgument")
val NavOptionsBuilder = ClassName.bestGuess("androidx.navigation.NavOptionsBuilder")
val PopUpToBuilder = ClassName.bestGuess("androidx.navigation.PopUpToBuilder")

val navArgument = MemberName("androidx.navigation", "navArgument")
val navDeepLink = MemberName("androidx.navigation", "navDeepLink")
// endregion

// region Compose
val ComposableAnnotation =
    AnnotationSpec.builder(ClassName.bestGuess("androidx.compose.runtime.Composable")).build()
val composable = MemberName("androidx.navigation.compose", "composable")
val dialog = MemberName("androidx.navigation.compose", "dialog")
// endregion

// region Parcelable
val Parcelize = AnnotationSpec.builder(ClassName.bestGuess("kotlinx.parcelize.Parcelize")).build()
val Parcelable = ClassName.bestGuess("android.os.Parcelable")
// endregion

// region Android
val Uri = ClassName.bestGuess("android.net.Uri")
val Bundle = ClassName.bestGuess("android.os.Bundle")
val SavedStateHandle = ClassName.bestGuess("androidx.lifecycle.SavedStateHandle")
// endregion

// region Library
val ScreenFactory = ClassName.bestGuess("jp.takuji31.compose.navigation.screen.ScreenFactory")
val ScreenFactoryRegistry =
    ClassName.bestGuess("jp.takuji31.compose.navigation.screen.ScreenFactoryRegistry")
// endregion
