package com.example.recycleviewtest

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FriendsViewModel : ViewModel() {
    // 原始好友列表
    private var friendList = mutableListOf<Friend>()
    // 受監控的LiveData，一旦指派新值就會更新好友列表畫面
    val friends: MutableLiveData<List<Friend>> by lazy { MutableLiveData<List<Friend>>() }

    init {
        loadFriends()
    }

    /**
     * 如果搜尋條件為空字串，就顯示原始好友列表；否則就顯示搜尋後結果
     * @param newText 欲搜尋的條件字串
     */
    fun search(newText: String?) {
        if (newText == null || newText.isEmpty()) {
            friends.value = friendList
        } else {
            val searchFriendList = mutableListOf<Friend>()
            friendList.forEach { friend ->
                if (friend.name.contains(newText, true)) {
                    searchFriendList.add(friend)
                }
            }
            friends.value = searchFriendList
        }
    }

    /** 模擬取得遠端資料 */
    private fun loadFriends() {
        val friendList = mutableListOf<Friend>()
        friendList.add(Friend(R.drawable.cat1, "Ivy" ))
        friendList.add(Friend(R.drawable.cat2, "Mary" ))
        friendList.add(Friend(R.drawable.cat3, "Sue"))
        friendList.add(Friend(R.drawable.cat1, "Ivy"))
        friendList.add(Friend(R.drawable.cat1, "Ivy" ))
        friendList.add(Friend(R.drawable.cat2, "Mary" ))
        friendList.add(Friend(R.drawable.cat3, "Sue"))
        friendList.add(Friend(R.drawable.cat1, "Ivy" ))
        friendList.add(Friend(R.drawable.cat2, "Mary" ))
        friendList.add(Friend(R.drawable.cat3, "Sue"))
        friendList.add(Friend(R.drawable.cat1, "Ivy" ))
        friendList.add(Friend(R.drawable.cat2, "Mary" ))
        friendList.add(Friend(R.drawable.cat3, "Sue"))

        this.friendList = friendList
        this.friends.value = this.friendList
    }
}