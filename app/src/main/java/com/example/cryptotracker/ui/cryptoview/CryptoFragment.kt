package com.example.cryptotracker.ui.cryptoview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.navigation.fragment.navArgs
import com.example.cryptotracker.R
import com.example.cryptotracker.databinding.FragmentCryptoViewBinding
import com.example.cryptotracker.databinding.FragmentEthGasBinding
import com.example.cryptotracker.ui.CryptoViewModel

// show specific crypto data
class CryptoFragment: Fragment(){
    private lateinit var viewModel: CryptoViewModel
    private var _binding: FragmentCryptoViewBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
//    val args: CryptoViewFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCryptoViewBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}