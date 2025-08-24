package com.example.adaptiveapp.ui

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.adaptiveapp.data.Course

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AdaptiveApp() {
    val viewModel: CourseViewModel = viewModel()
    var selectedCourseId by remember { mutableStateOf<Int?>(null) }
    val selectedCourse: Course? = selectedCourseId?.let { viewModel.getCourseById(it) }

    val isExpandedScreen =
        androidx.compose.ui.platform.LocalConfiguration.current.screenWidthDp > 600

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(selectedCourse?.title ?: "AdaptiveApp")
                },
                navigationIcon = {
                    if (selectedCourse != null && !isExpandedScreen) {
                        IconButton(onClick = { selectedCourseId = null }) {
                            Icon(
                                imageVector = Icons.Default.ArrowBack,
                                contentDescription = "Back"
                            )
                        }
                    }
                }
            )
        }
    ) { padding ->
        if (isExpandedScreen) {
            // Two-pane layout
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding)
            ) {
                CourseListScreen(
                    courses = viewModel.courses,
                    onCourseClick = { selectedCourseId = it },
                    modifier = Modifier.weight(1f)
                )
                Divider(modifier = Modifier.weight(0.01f))
                CourseDetailScreen(
                    course = selectedCourse,
                    onBackClick = { /* no-op in two-pane */ },
                    modifier = Modifier.weight(2f)
                )
            }
        } else {
            // Single-pane navigation
            if (selectedCourse == null) {
                CourseListScreen(
                    courses = viewModel.courses,
                    onCourseClick = { selectedCourseId = it },
                    modifier = Modifier.padding(padding)
                )
            } else {
                CourseDetailScreen(
                    course = selectedCourse,
                    onBackClick = { selectedCourseId = null },
                    modifier = Modifier.padding(padding)
                )
            }
        }
    }
}
