package com.phong.baitapturenluyen_fragment_1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.phong.adapter.SanPhamAdapter;
import com.phong.model.SanPham;

import java.util.ArrayList;

public class MyFragment extends Fragment {
    private ArrayList<SanPham> sanPhams;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.my_fragment,null);
        ListView lvSanPham = view.findViewById(R.id.lvSanPham);
        sanPhams = new ArrayList<>();
        sanPhams.add(new SanPham("Long Range Move Equipment","Warp to a distant quadrant in one move.",20000,R.drawable.ngoisao,false));
        sanPhams.add(new SanPham("Extra Shields","Stronger shields to protect the ship.",5000,R.drawable.khien,false));
        sanPhams.add(new SanPham("Galaxy Barrier Device","Move through the barrier at the edge of galazy.",10,R.drawable.raochan,true));
        SanPhamAdapter adapter = new SanPhamAdapter(getActivity(),sanPhams);
        lvSanPham.setAdapter(adapter);
        return view;
    }
}
