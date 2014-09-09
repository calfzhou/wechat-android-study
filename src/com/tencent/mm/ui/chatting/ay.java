package com.tencent.mm.ui.chatting;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.mm.ar.b;
import com.tencent.mm.k;
import com.tencent.mm.q.h;
import java.util.List;

final class ay extends BaseAdapter
{
  private ay(av paramav)
  {
  }

  private h qd(int paramInt)
  {
    return (h)av.b(this.jnz).dqr.get(paramInt);
  }

  public final int getCount()
  {
    return av.a(this.jnz);
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null);
    for (TextView localTextView = (TextView)av.c(this.jnz).inflate(k.bci, paramViewGroup, false); ; localTextView = (TextView)paramView)
    {
      h localh = qd(paramInt);
      localTextView.setTag(localh);
      localTextView.setText(b.e(av.d(this.jnz), localh.name, -1));
      return localTextView;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ay
 * JD-Core Version:    0.6.2
 */