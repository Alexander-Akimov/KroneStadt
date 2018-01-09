package com.akimov.swsh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.akimov.swsh.Model.Player
import com.akimov.swsh.R
import com.akimov.swsh.utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var player = Player("","")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun leagueNextClicked(view: View) {
        if (player.league != "") {

            val skillActivityIntent = Intent( this@LeagueActivity, SkillActivity::class.java)
            skillActivityIntent.putExtra(EXTRA_PLAYER, player)
            startActivity(skillActivityIntent)
        } else {
            Toast.makeText(this, "Please select a league.", Toast.LENGTH_SHORT).show()
        }
    }

    fun onMensClicked(view: View) {
        womensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false
        player.league = "mens"
    }

    fun onWomensClicked(view: View) {
        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        player.league = "womens"
    }

    fun onCoedClicked(view: View) {
        womensLeagueBtn.isChecked = false
        mensLeagueBtn.isChecked = false

        player.league = "co-ed"
    }
}
