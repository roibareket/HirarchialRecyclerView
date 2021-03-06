package bareket.com.hierarchicalrecyclerviewsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import bareket.com.hierarchicalrecyclerview.NestedScrollHelper;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView mRecyclerView = (RecyclerView)findViewById(R.id.my_recycler_view);
        NestedLinearLayoutManager layoutManager = new NestedLinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);

        // specify an adapter (see also next example)
        List commentDataList = generateComments();
        CommentsAdapter mAdapter = new CommentsAdapter(commentDataList);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.addOnScrollListener(new OnNestedScrollListener(this, layoutManager, commentDataList));
    }







    private List<CommentData> generateComments() {
        ArrayList<CommentData> commentDataList = new ArrayList<>();
        commentDataList.add(new CommentData("1", null, R.drawable.avatar1, "Michael Jackson", "1. She was more like a beauty queen from a movie scene I said don't mind, but what do you mean I am the one Who will dance on the floor in the round She said I am the one who will dance on the floor in the round"));
        commentDataList.add(new CommentData("1.1", "1", R.drawable.avatar2, "John Lennon", "1.1 Imagine there's no heaven It's easy if you try No hell below us Above us only sky Imagine all the people Living for today... Imagine there's no countries It isn't hard to do Nothing to kill or die for And no religion too Imagine all the people Living life in peace..."));
        commentDataList.add(new CommentData("1.2", "1", R.drawable.avatar3, "Led Zeppelin", "1.2 And as we wind on down the road Our shadows taller than our souls There walks a lady we all know Who shines white light and wants to show How everything still turns to gold And if you listen very hard The tune will come to you at last When all is one and one is all To be a rock and not to roll"));
        commentDataList.add(new CommentData("1.2.1", "1.2", R.drawable.avatar4, "Queen", "1.2.1 This song actually tells a story (so I've heard) The protagonist (we shall name him Fred) is in love with a girl, but her heart is stolen by a crime lord. Enraged, Fred kills the crime lord. He's had his revenge, but now the entire mob is after him, so he must flee the country. He says goodbye to his mother (one of the most moving goodbye's in history) and sets off in hope of escaping the mob's wrath. Unfortunately, in vain: The mob catches up with him at last. He pleads for mercy (mama mia! Mama mia! Mama mia let me go) but of course he is cruelly refused (bismillah, no! We will not let you go)"));
        commentDataList.add(new CommentData("1.2.2", "1.2", R.drawable.avatar5, "Keane", "1.2.2 Although this song can be interpreted in a million and one ways, the lyrics are absolutely amazing. They can represent so many different times during a life, which allows basically everyone to be able to relate to it.M+8 This song remembering me about we life for god and if we dead, there we have the next life in heaven because we life in earth only a few years but in heaven we life forever.. \"This can be the end of everything, So Why don't we go to Somewhere Only We Know\"! Always trust the GOD!"));
        commentDataList.add(new CommentData("1.2.2.1", "1.2.2", R.drawable.avatar6, "Bob Dylan", "1.2.2.1 No one can beat Bob Dylan when it comes to lyrics. After a point of time they aren't even song lyrics, they are sheer poetry.. Whats disappointing is that they haven't mentioned 'Mr Tambourine Man' by him HM+19 How amazing that Michael Jackson beats Bobby in this poll. Dylan was a genius, and probably the most impressive song writer that I have ever had the privilege of listening toM+12 Bob Dylan is truly a legend when it comes to music and poetry, I'm surprised this song of his has not made the top tens as of yet. I also listen to Michael Jackson and John Lennon, but Bob tops them both with lyrical brilliance shining through his work."));
        commentDataList.add(new CommentData("1.2.2.1.1", "1.2.2.1", R.drawable.avatar3, "Led Zeppelin", "1.2.2.1.1 And as we wind on down the road Our shadows taller than our souls There walks a lady we all know Who shines white light and wants to show How everything still turns to gold And if you listen very hard The tune will come to you at last When all is one and one is all To be a rock and not to roll"));
        commentDataList.add(new CommentData("1.2.2.1.1.1", "1.2.2.1.1", R.drawable.avatar4, "Queen", "1.2.2.1.1.1 This song actually tells a story (so I've heard) The protagonist (we shall name him Fred) is in love with a girl, but her heart is stolen by a crime lord. Enraged, Fred kills the crime lord. He's had his revenge, but now the entire mob is after him, so he must flee the country. He says goodbye to his mother (one of the most moving goodbye's in history) and sets off in hope of escaping the mob's wrath. Unfortunately, in vain: The mob catches up with him at last. He pleads for mercy (mama mia! Mama mia! Mama mia let me go) but of course he is cruelly refused (bismillah, no! We will not let you go)"));
        commentDataList.add(new CommentData("1.3", "1", R.drawable.avatar7, "Michael Jackson", "1.3 And The Dream We Were Conceived In Will Reveal A Joyful Face And The World We Once Believed In Will Shine Again In Grace Then Why Do We Keep Strangling Life Wound This Earth Crucify Its Soul Though It's Plain To See This World Is Heavenly Be God's Glow"));
        commentDataList.add(new CommentData("1.4", "1", R.drawable.avatar8, "Don McLean", "1.4 And in the streets the children screamed The lovers cried and the poets dreamed But not a word was spoken The church bells all were broken And the three men I admire most The Father Son and Holy Ghost They caught the last train for the coast The day the music died"));
        commentDataList.add(new CommentData("1.4.1", "1.4", R.drawable.avatar1, "Michael Jackson", "1.4.1 She was more like a beauty queen from a movie scene I said don't mind, but what do you mean I am the one Who will dance on the floor in the round She said I am the one who will dance on the floor in the round"));
        commentDataList.add(new CommentData("1.4.2", "1.4", R.drawable.avatar2, "John Lennon", "1.4.2 Imagine there's no heaven It's easy if you try No hell below us Above us only sky Imagine all the people Living for today... Imagine there's no countries It isn't hard to do Nothing to kill or die for And no religion too Imagine all the people Living life in peace..."));
        commentDataList.add(new CommentData("2", null, R.drawable.avatar3, "Led Zeppelin", "2 And as we wind on down the road Our shadows taller than our souls There walks a lady we all know Who shines white light and wants to show How everything still turns to gold And if you listen very hard The tune will come to you at last When all is one and one is all To be a rock and not to roll"));
        commentDataList.add(new CommentData("2.1", "2", R.drawable.avatar4, "Queen", "2.1 This song actually tells a story (so I've heard) The protagonist (we shall name him Fred) is in love with a girl, but her heart is stolen by a crime lord. Enraged, Fred kills the crime lord. He's had his revenge, but now the entire mob is after him, so he must flee the country. He says goodbye to his mother (one of the most moving goodbye's in history) and sets off in hope of escaping the mob's wrath. Unfortunately, in vain: The mob catches up with him at last. He pleads for mercy (mama mia! Mama mia! Mama mia let me go) but of course he is cruelly refused (bismillah, no! We will not let you go)"));
        commentDataList.add(new CommentData("2.2", "2", R.drawable.avatar5, "Keane", "2.2 Although this song can be interpreted in a million and one ways, the lyrics are absolutely amazing. They can represent so many different times during a life, which allows basically everyone to be able to relate to it.M+8 This song remembering me about we life for god and if we dead, there we have the next life in heaven because we life in earth only a few years but in heaven we life forever.. \"This can be the end of everything, So Why don't we go to Somewhere Only We Know\"! Always trust the GOD!"));
        return commentDataList;
    }

}
