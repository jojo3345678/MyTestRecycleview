package com.example.recycleviewtest

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import androidx.fragment.app.viewModels
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recycleviewtest.databinding.FragmentFriendsBinding

class FriendsFragment : Fragment() {

    private lateinit var binding: FragmentFriendsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        // SearchView放在畫面頂端時通常會隱藏標題列
        (requireActivity() as MainActivity).supportActionBar?.hide()
        val viewModel: FriendsViewModel by viewModels()
        binding = FragmentFriendsBinding.inflate(inflater, container, false)
        binding.viewModel = viewModel
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        with(binding) {
            recyclerView.layoutManager = LinearLayoutManager(requireContext())
            viewModel?.friends?.observe(viewLifecycleOwner) { friends ->
                // adapter為null要建立新的adapter；之後只要呼叫updateFriends(friends)即可
                if (recyclerView.adapter == null) {
                    recyclerView.adapter = FriendAdapter(friends)
                } else {
                    (recyclerView.adapter as FriendAdapter).updateFriends(friends)
                }
            }

            searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
                // 輸入的文字改變時呼叫
                override fun onQueryTextChange(newText: String?): Boolean {
                    viewModel?.search(newText)
                    return true
                }
                // 點擊虛擬鍵盤上的提交鈕時呼叫
                override fun onQueryTextSubmit(text: String): Boolean {
                    return false
                }
            })
        }
    }
}