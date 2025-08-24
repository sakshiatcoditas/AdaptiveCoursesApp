package com.example.adaptiveapp.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.adaptiveapp.data.Course

@Composable
fun CourseDetailScreen(
    course: Course?,
    onBackClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    if (course == null) {
        Box(
            modifier = modifier.fillMaxSize(),
            contentAlignment = androidx.compose.ui.Alignment.Center
        ) {
            Text("Select a course to see details")
        }
    } else {
        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Text(course.description, style = MaterialTheme.typography.bodyLarge)
        }
    }
}
