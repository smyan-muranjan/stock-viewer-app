package com.example.stockviewer

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.example.stockviewer.fragments.HomeFragment
import com.example.stockviewer.remote.ApiClient
import com.example.stockviewer.ui.theme.StockViewerTheme

class MainActivity : AppCompatActivity(R.layout.home_activity) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState == null) {
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add<HomeFragment>(R.layout.home_fragment)
            }
        }
    }
}