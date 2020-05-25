package cz.muni.pv239.spotifymer.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import cz.muni.pv239.spotifymer.view.swipe_menu.PlaylistsFragment
import cz.muni.pv239.spotifymer.view.swipe_menu.TopArtistsFragment

class ViewPageAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 1
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> PlaylistsFragment()
            else -> TopArtistsFragment()
        }
    }
}