package com.tencent.mm.ui.setting;

import android.content.res.Resources;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckedTextView;
import com.tencent.mm.g;
import com.tencent.mm.h;
import com.tencent.mm.k;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.z;

final class er extends BaseAdapter
{
  int count = 0;
  Cursor cursor;
  int padding = 0;

  public er(SettingsRingtoneUI paramSettingsRingtoneUI, Cursor paramCursor)
  {
    this.cursor = paramCursor;
    this.count = (1 + paramCursor.getCount());
    z.d("!32@gYUvCHi91do+WRaEASHU65WymiD826j/", "count = " + this.count);
    this.padding = paramSettingsRingtoneUI.getResources().getDimensionPixelSize(g.PH);
  }

  private String hm(int paramInt)
  {
    if ((this.cursor.isClosed()) || (!this.cursor.moveToPosition(paramInt - 1)))
      return "";
    return this.cursor.getString(this.cursor.getColumnIndex("title"));
  }

  public final int getCount()
  {
    return this.count;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    CheckedTextView localCheckedTextView = (CheckedTextView)this.jNZ.jNV.inflate(k.select_dialog_singlechoice, null);
    if (paramInt == 0)
    {
      localCheckedTextView.setBackgroundResource(h.Uj);
      localCheckedTextView.setText(n.cge);
    }
    while (true)
    {
      localCheckedTextView.setPadding(this.padding, 0, this.padding, 0);
      localCheckedTextView.setCheckMarkDrawable(h.ZK);
      return localCheckedTextView;
      localCheckedTextView.setBackgroundResource(h.Uj);
      localCheckedTextView.setText(hm(paramInt));
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.er
 * JD-Core Version:    0.6.2
 */