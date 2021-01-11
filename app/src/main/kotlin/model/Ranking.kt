package jp.takuji31.compose.navigation.example.model

import jp.takuji31.compose.navigation.example.navigation.RankingType

data class Ranking(val rankingType: RankingType, val entries: List<Entry>)
