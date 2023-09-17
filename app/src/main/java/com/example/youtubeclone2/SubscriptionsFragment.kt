package com.example.youtubeclone2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.youtubeclone2.adapter.*
import com.example.youtubeclone2.utils.RvHomeTopGenreData

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"
private lateinit var adapter: RvSubscriptionsTopChannelsAdapter
private lateinit var rvSubscriptionsTop: RecyclerView

private lateinit var adapterGenre: RvHomeTopGenreAdapter
private lateinit var rvGenre: RecyclerView

private lateinit var adapterMainVidSingle: RvMainVidAdapter
private lateinit var rvMainVidSingle: RecyclerView

private lateinit var adapterRvShorts: RvShortsAdapter
private lateinit var rvShorts: RecyclerView

private lateinit var rvSecondVidSingle: RecyclerView

private lateinit var adapterRvStories: RvStoriesAdapter
private lateinit var rvStories: RecyclerView

private lateinit var rvMainVidMultiple: RecyclerView

private lateinit var rvNews: RecyclerView
private lateinit var adapterNews: RvNewsAdapter
/**
 * A simple [Fragment] subclass.
 * Use the [SubscriptionsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SubscriptionsFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_subscriptions, container, false)
        rvSubscriptionsTop = view.findViewById(R.id.rvSubscriptionsTop)
        rvGenre = view.findViewById(R.id.rvGenre)
        rvMainVidSingle = view.findViewById(R.id.rvMainVidSingle)
        rvShorts = view.findViewById(R.id.rvShorts)
        rvSecondVidSingle = view.findViewById(R.id.rvSecondVidSingle)
        rvStories = view.findViewById(R.id.rvStories)
        rvMainVidMultiple = view.findViewById(R.id.rvMainVidMultiple)
        rvNews = view.findViewById(R.id.rvNews)

        initRecyclerViewAccounts()
        initRecyclerViewGenre()
        initRecyclerViewMainVidSingle()
        initRecyclerViewShorts()
        initRecyclerViewSecondVidSingle()
        initRecyclerViewStories()
        initRecyclerViewMainVidMultiple()
        initRecyclerViewNews()

        return view
    }

    private fun initRecyclerViewNews() {
        adapterNews = RvNewsAdapter(RvHomeTopGenreData.collectionRvNewsAdapter)
        rvNews.adapter = adapterNews
    }

    private fun initRecyclerViewMainVidMultiple() {
        adapterMainVidSingle = RvMainVidAdapter(RvHomeTopGenreData.collectionRvMainVidAdapter_multiple)
        rvMainVidMultiple.adapter = adapterMainVidSingle
    }

    private fun initRecyclerViewStories() {
        adapterRvStories = RvStoriesAdapter(RvHomeTopGenreData.collectionRvStories)
        rvStories.adapter = adapterRvStories
    }

    private fun initRecyclerViewSecondVidSingle() {
        adapterMainVidSingle = RvMainVidAdapter(RvHomeTopGenreData.collectionRvMainVidAdapter_fro_rvSecondVid)
        rvSecondVidSingle.adapter = adapterMainVidSingle
    }

    private fun initRecyclerViewShorts() {
        adapterRvShorts = RvShortsAdapter(RvHomeTopGenreData.collectionRvShortsModel)
        rvShorts.adapter = adapterRvShorts
    }

    private fun initRecyclerViewMainVidSingle() {
        adapterMainVidSingle = RvMainVidAdapter(RvHomeTopGenreData.collectionRvMainVidAdapter)
        rvMainVidSingle.adapter = adapterMainVidSingle
    }

    private fun initRecyclerViewGenre() {
        adapterGenre = RvHomeTopGenreAdapter(RvHomeTopGenreData.collectionRvSubscriptionGenreModel)
        rvGenre.adapter = adapterGenre
    }

    private fun initRecyclerViewAccounts() {
        adapter = RvSubscriptionsTopChannelsAdapter(RvHomeTopGenreData.collectionRvSubscriptionsTopChannelsModel)
        rvSubscriptionsTop.adapter = adapter
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment SubscriptionsFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            SubscriptionsFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}