package edu.quinnipiac.ser210.asignment2lazycolbrandonm

import Country
import CountryList
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import edu.quinnipiac.ser210.asignment2lazycolbrandonm.ui.theme.Asignment2LazyColBrandonMTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@Composable
fun CountryList(modifier: Modifier = Modifier
) {
    CountryListColumn(countryList = CountryList, modifier)
}

@Composable
fun CountryListColumn(countryList: List<Country>, modifier: Modifier = Modifier) {
    LazyColumn (
        modifier = modifier){

        items(items = countryList){ country ->
            CountryItem(country = country, modifier)

        }
    }
}

@Composable
fun CountryItem(country: Country, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp)
            .background(Color.White)
    ) {


        Image(
            painter = painterResource(id = country.flag),
            contentDescription = "Flag of ${country.name}",
            modifier = Modifier.size(50.dp).padding(4.dp)
        )

        Text(
            text = country.name,
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.padding(4.dp)
        )
        Text(
            text = "Currency : ${country.currency}",
            style = MaterialTheme.typography.bodySmall,
            modifier = Modifier.padding(4.dp)
        )
        Text(
            text = "Fun Fact: ${country.fact}",
            style = MaterialTheme.typography.bodySmall,
            modifier = Modifier.padding(4.dp)
        )
    }
}

@Preview
@Composable
private fun CountryListPreview() {
    Asignment2LazyColBrandonMTheme {
        CountryList()
    }
}