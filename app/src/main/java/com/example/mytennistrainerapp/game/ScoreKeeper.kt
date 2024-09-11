package com.example.mytennistrainerapp.game

class ScoreKeeper {
    private var score = 0

    fun incrementScore(points: Int) {
        score += points
    }

    fun getScore(): Int {
        return score
    }

    fun resetScore() {
        score = 0
    }

    // Add more scoring-related methods
}