package org.techtown.androidstudy;

import android.view.View;

// 21.08.10 list recycler view
public interface OnPersonItemClickListener {

    public void onItemClick(PersonAdapter.ViewHolder holder, View view, int position);
}
