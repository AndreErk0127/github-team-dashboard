package com.github.xalvarez.githubteamdashboard.github

import io.micronaut.http.annotation.Post
import io.micronaut.http.client.annotation.Client

@BearerToken
@Client("\${github.apiUrl}")
interface GitHubClient {

    @Post
    fun fetchDashboardData(query: String): GithubDashboardData
}
