package com.example.recycleviewtest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.findViewTreeLifecycleOwner
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleviewtest.databinding.FrienditemBinding

class FriendAdapter (private var friends: List<Friend>) :
    RecyclerView.Adapter<FriendAdapter.FriendViewHolder>() {

    /**
     * 更新好友列表內容
     * @param friends 新的好友列表
     */
    fun updateFriends(friends: List<Friend>) {
        this.friends = friends
        notifyDataSetChanged()
    }

    class FriendViewHolder(val itemViewBinding: FrienditemBinding) :
        RecyclerView.ViewHolder(itemViewBinding.root)

    override fun getItemCount(): Int {
        return friends.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FriendViewHolder {
        val itemViewBinding = FrienditemBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        itemViewBinding.viewModel = FriendViewModel()
        // 設定lifecycleOwner方能監控LiveData資料變化，layout檔案的view才會更新顯示
        itemViewBinding.lifecycleOwner = parent.findViewTreeLifecycleOwner()
        return FriendViewHolder(itemViewBinding)
    }

    override fun onBindViewHolder(holder: FriendViewHolder, position: Int) {
        val friend = friends[position]
        with(holder) {
            // 將欲顯示的friend物件指派給LiveData，就會自動更新layout檔案的view顯示
            itemViewBinding.viewModel?.friend?.value = friend
            val bundle = Bundle()
            bundle.putSerializable("friend", friend)
            itemView.setOnClickListener {
                Navigation.findNavController(it)
                    .navigate(R.id.action_friendsFragment_to_friendChatFragment, bundle)
            }
        }
    }
}