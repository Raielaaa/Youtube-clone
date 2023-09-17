package com.example.youtubeclone2.utils

import android.net.Uri
import com.example.youtubeclone2.adapter.RvLibraryTopVidAdapter
import com.example.youtubeclone2.adapter.RvMainVidAdapter
import com.example.youtubeclone2.model.*

object RvHomeTopGenreData {

    // Argument for RvHomeTopGenreAdapter
    private const val genre_1: String = "All"
    private const val genre_2: String = "Mixes"
    private const val genre_3: String = "Music"
    private const val genre_4: String = "Gaming"
    private const val genre_5: String = "Playlists"
    private const val genre_6: String = "Seven Lions"
    private const val genre_7: String = "Dota 2"
    private const val genre_8: String = "House Music"
    private const val genre_9: String = "Live"
    private const val genre_10: String = "Japanese Music"
    private const val genre_11: String = "Philippine Music"
    private const val genre_12: String = "Electric guitar"
    private const val genre_13: String = "Pop Rock"
    private const val genre_14: String = "Soundtracks"
    private const val genre_15: String = "Rhythm & Blues"
    private const val genre_16: String = "Computer programming"
    private const val genre_17: String = "Contemporary Worship Music"
    private const val genre_18: String = "Recently uploaded"
    private const val genre_19: String = "Watched"
    private const val genre_20: String = "Posts"
    private const val genre_21: String = "New to you"
    private const val genre_22: String = "SEND FEEDBACK"

    val collectionRvHomeTopGenreModel: List<RvHomeTopGenreModel> = listOf(
        RvHomeTopGenreModel(genre_1),
        RvHomeTopGenreModel(genre_2),
        RvHomeTopGenreModel(genre_3),
        RvHomeTopGenreModel(genre_4),
        RvHomeTopGenreModel(genre_5),
        RvHomeTopGenreModel(genre_6),
        RvHomeTopGenreModel(genre_7),
        RvHomeTopGenreModel(genre_8),
        RvHomeTopGenreModel(genre_9),
        RvHomeTopGenreModel(genre_10),
        RvHomeTopGenreModel(genre_11),
        RvHomeTopGenreModel(genre_12),
        RvHomeTopGenreModel(genre_13),
        RvHomeTopGenreModel(genre_14),
        RvHomeTopGenreModel(genre_15),
        RvHomeTopGenreModel(genre_16),
        RvHomeTopGenreModel(genre_17),
        RvHomeTopGenreModel(genre_18),
        RvHomeTopGenreModel(genre_19),
        RvHomeTopGenreModel(genre_20),
        RvHomeTopGenreModel(genre_21),
        RvHomeTopGenreModel(genre_22)
    )


    // Argument for RvSubscriptionsTopChannelsAdapter
    private val uri_pic1: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic1")
    private val uri_pic2: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic2")
    private val uri_pic3: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic3")
    private val uri_pic4: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic4")
    private val uri_pic5: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic5")
    private val uri_pic6: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic6")
    private val uri_pic7: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic7")
    private val uri_pic8: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic8")
    private val uri_pic9: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic9")
    private val uri_pic10: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic10")
    private val uri_pic11: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic11")

    val collectionRvSubscriptionsTopChannelsModel: List<RvSubscriptionsTopChannelsModel> = listOf(
        RvSubscriptionsTopChannelsModel(uri_pic1, "Chromatica"),
        RvSubscriptionsTopChannelsModel(uri_pic2, "Spectrum"),
        RvSubscriptionsTopChannelsModel(uri_pic3, "Strokes"),
        RvSubscriptionsTopChannelsModel(uri_pic4, "Pigment"),
        RvSubscriptionsTopChannelsModel(uri_pic5, "Artisan"),
        RvSubscriptionsTopChannelsModel(uri_pic6, "Masterpiece"),
        RvSubscriptionsTopChannelsModel(uri_pic7, "Palette"),
        RvSubscriptionsTopChannelsModel(uri_pic8, "Canvas"),
        RvSubscriptionsTopChannelsModel(uri_pic9, "Vivid"),
        RvSubscriptionsTopChannelsModel(uri_pic10, "Acrylic"),
        RvSubscriptionsTopChannelsModel(uri_pic11, "Hues")
    )




    // Argument for RvHomeTopGenreAdapter (usage = subscription genre)
    private const val genre_1_subscriptionGenre: String = "All"
    private const val genre_2_subscriptionGenre: String = "Today"
    private const val genre_3_subscriptionGenre: String = "Continue watching"
    private const val genre_4_subscriptionGenre: String = "Unwatched"
    private const val genre_5_subscriptionGenre: String = "Live"
    private const val genre_6_subscriptionGenre: String = "Posts"
    private const val genre_7_subscriptionGenre: String = "Settings"

    val collectionRvSubscriptionGenreModel: List<RvHomeTopGenreModel> = listOf(
        RvHomeTopGenreModel(genre_1_subscriptionGenre),
        RvHomeTopGenreModel(genre_2_subscriptionGenre),
        RvHomeTopGenreModel(genre_3_subscriptionGenre),
        RvHomeTopGenreModel(genre_4_subscriptionGenre),
        RvHomeTopGenreModel(genre_5_subscriptionGenre),
        RvHomeTopGenreModel(genre_6_subscriptionGenre),
        RvHomeTopGenreModel(genre_7_subscriptionGenre)
    )



    // Argument for RvMainVidAdapter -> Subscription fragment
    private val uri_thumbnail: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic1")
    private val uri_thumbnail2: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic10")
    private val uri_channelIcon: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic2")
    private val uri_channelIcon2: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic10")
    private const val topString: String = "Top art to be released next week!"
    private const val bottomString: String = "Art museum · 748 views · 2 weeks ago"
    private const val timeDuration: String = "2:06"
    private const val timeDuration2: String = "4:55"

    val collectionRvMainVidAdapter: List<RvMainVidModel> = listOf(
//        RvMainVidModel(uri_thumbnail, uri_channelIcon, topString, bottomString, timeDuration),
        RvMainVidModel(uri_thumbnail2, uri_channelIcon2, topString, bottomString, timeDuration2)
    )

    // Argument for RvShortsAdapter
    private val uri_pic1_shorts: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic1")
    private val uri_pic2_shorts: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic2")
    private val uri_pic3_shorts: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic3")
    private val uri_pic4_shorts: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic4")
    private val uri_pic5_shorts: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic5")
    private val uri_pic6_shorts: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic6")
    private val uri_pic7_shorts: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic7")
    private val uri_pic8_shorts: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic8")
    private val uri_pic9_shorts: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic9")
    private val uri_pic10_shorts: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic10")
    private val uri_pic11_shorts: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic11")

    val collectionRvShortsModel: List<RvShortsModel> = listOf(
        RvShortsModel(uri_pic1_shorts, "where would you go in your free time?", "2.4k views"),
        RvShortsModel(uri_pic2_shorts, "the are that saves the day!", "43k views"),
        RvShortsModel(uri_pic3_shorts, "this is my banner!", "7.3k views"),
        RvShortsModel(uri_pic4_shorts, "I'm bored right now", "4.2k views"),
        RvShortsModel(uri_pic5_shorts, "why is this so hard?", "2.1k views"),
        RvShortsModel(uri_pic6_shorts, "nicest thing you can see right now", "76.6k views"),
        RvShortsModel(uri_pic7_shorts, "Hot art on galleries right now!", "19.2k views"),
        RvShortsModel(uri_pic8_shorts, "do you want to have this?", "43.2k views"),
        RvShortsModel(uri_pic9_shorts, "I don't have anything to say...", "633k views"),
        RvShortsModel(uri_pic10_shorts, "Nice art man!", "2.1k views"),
        RvShortsModel(uri_pic11_shorts, "who created this art???", "1.1k views")
    )


    // Argument for RvMainVidAdapter
    private val uri_thumbnail_secondVid: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic4")
    private val uri_channelIcon_secondVid: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic7")
    private const val topString_secondVid: String = "Art of the year has been announced! Stay tuned for more!"
    private const val bottomString_secondVid: String = "Top museum · 14.3k views · 5 weeks ago"
    private const val timeDuration_secondVid: String = "7:57"

    val collectionRvMainVidAdapter_fro_rvSecondVid: List<RvMainVidModel> = listOf(
        RvMainVidModel(uri_thumbnail_secondVid, uri_channelIcon_secondVid, topString_secondVid, bottomString_secondVid, timeDuration_secondVid)
    )


    // Argument for RvStoriesAdapter
    private val uri_stories_thumbnail_1: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic1")
    private val uri_stories_thumbnail_2: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic2")
    private val uri_stories_thumbnail_3: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic3")
    private val uri_stories_thumbnail_4: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic4")
    private val uri_stories_thumbnail_5: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic5")
    private val uri_stories_thumbnail_6: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic6")
    private val uri_stories_thumbnail_7: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic7")
    private val uri_stories_thumbnail_8: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic8")
    private val uri_stories_thumbnail_9: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic9")
    private val uri_stories_thumbnail_10: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic10")
    private val uri_stories_thumbnail_11: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic11")

    private val uri_stories_channelPic_1: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic11")
    private val uri_stories_channelPic_2: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic10")
    private val uri_stories_channelPic_3: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic9")
    private val uri_stories_channelPic_4: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic8")
    private val uri_stories_channelPic_5: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic7")
    private val uri_stories_channelPic_6: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic6")
    private val uri_stories_channelPic_7: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic5")
    private val uri_stories_channelPic_8: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic4")
    private val uri_stories_channelPic_9: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic3")
    private val uri_stories_channelPic_10: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic2")
    private val uri_stories_channelPic_11: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic1")

    private const val tvStoriesTitle_1: String = "House of Arts"
    private const val tvStoriesTitle_2: String = "BRIGHT SIDE"
    private const val tvStoriesTitle_3: String = "Psych2Go"
    private const val tvStoriesTitle_4: String = "ARJAY ANGEL"
    private const val tvStoriesTitle_5: String = "Majji shorts"
    private const val tvStoriesTitle_6: String = "Arts now"
    private const val tvStoriesTitle_7: String = "Arts later"
    private const val tvStoriesTitle_8: String = "The arts"
    private const val tvStoriesTitle_9: String = "Incredible makes"
    private const val tvStoriesTitle_10: String = "Mighty arts"
    private const val tvStoriesTitle_11: String = "Art stories"

    val collectionRvStories: List<RvStoriesModel> = listOf(
        RvStoriesModel(uri_stories_thumbnail_1, uri_stories_channelPic_1, tvStoriesTitle_1),
        RvStoriesModel(uri_stories_thumbnail_2, uri_stories_channelPic_2, tvStoriesTitle_2),
        RvStoriesModel(uri_stories_thumbnail_3, uri_stories_channelPic_3, tvStoriesTitle_3),
        RvStoriesModel(uri_stories_thumbnail_4, uri_stories_channelPic_4, tvStoriesTitle_4),
        RvStoriesModel(uri_stories_thumbnail_5, uri_stories_channelPic_5, tvStoriesTitle_5),
        RvStoriesModel(uri_stories_thumbnail_6, uri_stories_channelPic_6, tvStoriesTitle_6),
        RvStoriesModel(uri_stories_thumbnail_7, uri_stories_channelPic_7, tvStoriesTitle_7),
        RvStoriesModel(uri_stories_thumbnail_8, uri_stories_channelPic_8, tvStoriesTitle_8),
        RvStoriesModel(uri_stories_thumbnail_9, uri_stories_channelPic_9, tvStoriesTitle_9),
        RvStoriesModel(uri_stories_thumbnail_10, uri_stories_channelPic_10, tvStoriesTitle_10),
        RvStoriesModel(uri_stories_thumbnail_11, uri_stories_channelPic_11, tvStoriesTitle_11)
    )




    // Argument for RvMainVidAdapter -> Subscription fragment -> rvMainVidMultiple
    private val uri_thumbnail_multiple_1: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic1")
    private val uri_thumbnail_multiple_2: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic2")
    private val uri_thumbnail_multiple_3: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic3")
    private val uri_thumbnail_multiple_4: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic4")
    private val uri_thumbnail_multiple_5: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic5")
    private val uri_thumbnail_multiple_6: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic6")
    private val uri_thumbnail_multiple_7: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic7")
    private val uri_thumbnail_multiple_8: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic8")
    private val uri_thumbnail_multiple_9: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic9")
    private val uri_thumbnail_multiple_10: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic10")
    private val uri_thumbnail_multiple_11: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic11")

    private val uri_channelIcon_multiple_1: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic10")
    private val uri_channelIcon_multiple_2: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic9")
    private val uri_channelIcon_multiple_3: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic8")
    private val uri_channelIcon_multiple_4: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic7")
    private val uri_channelIcon_multiple_5: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic6")
    private val uri_channelIcon_multiple_6: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic5")
    private val uri_channelIcon_multiple_7: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic4")
    private val uri_channelIcon_multiple_8: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic3")
    private val uri_channelIcon_multiple_9: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic2")
    private val uri_channelIcon_multiple_10: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic1")
    private val uri_channelIcon_multiple_11: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic11")

    private const val topString_1: String = "Lorem ipsum dolor sit amet, consectetur adipiscing elit"
    private const val bottomString_1: String = "Art museum · 748 views · 2 weeks ago"
    private const val timeDuration_1: String = "2:06"

    private const val topString_2: String = "Lorem ipsum dolor sit amet, consectetur adipiscing elit"
    private const val bottomString_2: String = "Art museum · 748 views · 2 weeks ago"
    private const val timeDuration_2: String = "2:06"

    private const val topString_3: String = "Lorem ipsum dolor sit amet, consectetur adipiscing elit"
    private const val bottomString_3: String = "Art museum · 748 views · 2 weeks ago"
    private const val timeDuration_3: String = "2:06"

    private const val topString_4: String = "Lorem ipsum dolor sit amet, consectetur adipiscing elit"
    private const val bottomString_4: String = "Art museum · 748 views · 2 weeks ago"
    private const val timeDuration_4: String = "2:06"

    private const val topString_5: String = "Lorem ipsum dolor sit amet, consectetur adipiscing elit"
    private const val bottomString_5: String = "Art museum · 748 views · 2 weeks ago"
    private const val timeDuration_5: String = "2:06"

    private const val topString_6: String = "Lorem ipsum dolor sit amet, consectetur adipiscing elit"
    private const val bottomString_6: String = "Art museum · 748 views · 2 weeks ago"
    private const val timeDuration_6: String = "2:06"

    private const val topString_7: String = "Lorem ipsum dolor sit amet, consectetur adipiscing elit"
    private const val bottomString_7: String = "Art museum · 748 views · 2 weeks ago"
    private const val timeDuration_7: String = "2:06"

    private const val topString_8: String = "Lorem ipsum dolor sit amet, consectetur adipiscing elit"
    private const val bottomString_8: String = "Art museum · 748 views · 2 weeks ago"
    private const val timeDuration_8: String = "2:06"

    private const val topString_9: String = "Lorem ipsum dolor sit amet, consectetur adipiscing elit"
    private const val bottomString_9: String = "Art museum · 748 views · 2 weeks ago"
    private const val timeDuration_9: String = "2:06"

    private const val topString_10: String = "Lorem ipsum dolor sit amet, consectetur adipiscing elit"
    private const val bottomString_10: String = "Art museum · 748 views · 2 weeks ago"
    private const val timeDuration_10: String = "2:06"

    private const val topString_11: String = "Lorem ipsum dolor sit amet, consectetur adipiscing elit"
    private const val bottomString_11: String = "Art museum · 748 views · 2 weeks ago"
    private const val timeDuration_11: String = "2:06"

    val collectionRvMainVidAdapter_multiple: List<RvMainVidModel> = listOf(
        RvMainVidModel(uri_thumbnail_multiple_1, uri_channelIcon_multiple_1, topString_1, bottomString_1, timeDuration_1),
        RvMainVidModel(uri_thumbnail_multiple_2, uri_channelIcon_multiple_2, topString_2, bottomString_2, timeDuration_2),
        RvMainVidModel(uri_thumbnail_multiple_3, uri_channelIcon_multiple_3, topString_3, bottomString_3, timeDuration_3),
        RvMainVidModel(uri_thumbnail_multiple_4, uri_channelIcon_multiple_4, topString_4, bottomString_4, timeDuration_4),
        RvMainVidModel(uri_thumbnail_multiple_5, uri_channelIcon_multiple_5, topString_5, bottomString_5, timeDuration_5),
        RvMainVidModel(uri_thumbnail_multiple_6, uri_channelIcon_multiple_6, topString_6, bottomString_6, timeDuration_6),
        RvMainVidModel(uri_thumbnail_multiple_7, uri_channelIcon_multiple_7, topString_7, bottomString_7, timeDuration_7),
        RvMainVidModel(uri_thumbnail_multiple_8, uri_channelIcon_multiple_8, topString_8, bottomString_8, timeDuration_8),
        RvMainVidModel(uri_thumbnail_multiple_9, uri_channelIcon_multiple_9, topString_9, bottomString_9, timeDuration_9),
        RvMainVidModel(uri_thumbnail_multiple_10, uri_channelIcon_multiple_10, topString_10, bottomString_10, timeDuration_10),
        RvMainVidModel(uri_thumbnail_multiple_11, uri_channelIcon_multiple_11, topString_11, bottomString_11, timeDuration_11)
    )

    //Argument for news
    private val uri_news_pic1: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic1")
    private val uri_news_pic2: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic2")
    private val uri_news_pic3: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic3")
    private val uri_news_pic4: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic4")
    private val uri_news_pic5: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic5")

    private const val tvNewsPosition_1: String = "1/5"
    private const val tvNewsPosition_2: String = "2/5"
    private const val tvNewsPosition_3: String = "3/5"
    private const val tvNewsPosition_4: String = "4/5"
    private const val tvNewsPosition_5: String = "5/5"

    val collectionRvNewsAdapter: List<RvNewsModel> = listOf(
        RvNewsModel(uri_news_pic1, tvNewsPosition_1),
        RvNewsModel(uri_news_pic2, tvNewsPosition_2),
        RvNewsModel(uri_news_pic3, tvNewsPosition_3),
        RvNewsModel(uri_news_pic4, tvNewsPosition_4),
        RvNewsModel(uri_news_pic5, tvNewsPosition_5)
    )


    //Argument for RvLibraryTopVidAdapter
    private val uri_library_top_pic1: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic1")
    private val uri_library_top_pic2: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic2")
    private val uri_library_top_pic3: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic3")
    private val uri_library_top_pic4: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic4")
    private val uri_library_top_pic5: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic5")
    private val uri_library_top_pic6: Uri = Uri.parse("android.resource://com.example.youtubeclone2/drawable/pic6")

    private const val tvHeaderTopLibrary1: String = "Lorem ipsum dolor sit amet"
    private const val tvHeaderTopLibrary2: String = "Lorem ipsum dolor sit amet"
    private const val tvHeaderTopLibrary3: String = "Lorem ipsum dolor sit amet"
    private const val tvHeaderTopLibrary4: String = "Lorem ipsum dolor sit amet"
    private const val tvHeaderTopLibrary5: String = "Lorem ipsum dolor sit amet"
    private const val tvHeaderTopLibrary6: String = "Lorem ipsum dolor sit amet"

    private const val tvHeaderBottomLibrary1: String = "Lorem ipsum dolor sit amet"
    private const val tvHeaderBottomLibrary2: String = "Lorem ipsum dolor sit amet"
    private const val tvHeaderBottomLibrary3: String = "Lorem ipsum dolor sit amet"
    private const val tvHeaderBottomLibrary4: String = "Lorem ipsum dolor sit amet"
    private const val tvHeaderBottomLibrary5: String = "Lorem ipsum dolor sit amet"
    private const val tvHeaderBottomLibrary6: String = "Lorem ipsum dolor sit amet"

    private const val timeDurationLibrary_1: String = "2:06"
    private const val timeDurationLibrary_2: String = "2:06"
    private const val timeDurationLibrary_3: String = "2:06"
    private const val timeDurationLibrary_4: String = "2:06"
    private const val timeDurationLibrary_5: String = "2:06"
    private const val timeDurationLibrary_6: String = "2:06"

    val collectionRvLibraryTopVidAdapter: List<RvLibraryTopVidModel> = listOf(
        RvLibraryTopVidModel(uri_library_top_pic1, tvHeaderTopLibrary1, tvHeaderBottomLibrary1, timeDurationLibrary_1, false),
        RvLibraryTopVidModel(uri_library_top_pic2, tvHeaderTopLibrary2, tvHeaderBottomLibrary2, timeDurationLibrary_2, false),
        RvLibraryTopVidModel(uri_library_top_pic3, tvHeaderTopLibrary3, tvHeaderBottomLibrary3, timeDurationLibrary_3, false),
        RvLibraryTopVidModel(uri_library_top_pic4, tvHeaderTopLibrary4, tvHeaderBottomLibrary4, timeDurationLibrary_4, false),
        RvLibraryTopVidModel(uri_library_top_pic5, tvHeaderTopLibrary5, tvHeaderBottomLibrary5, timeDurationLibrary_5, false),
        RvLibraryTopVidModel(uri_library_top_pic6, tvHeaderTopLibrary6, tvHeaderBottomLibrary6, timeDurationLibrary_6, false)
    )
}