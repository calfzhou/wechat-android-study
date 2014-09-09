package com.tencent.mm.ui;

import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.h;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.ch;

final class eg extends BaseAdapter
{
  private eg(ed paramed)
  {
  }

  public final int getCount()
  {
    return ed.a(this.iNn).size();
  }

  public final Object getItem(int paramInt)
  {
    return null;
  }

  public final long getItemId(int paramInt)
  {
    return 0L;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    ei localei = (ei)ed.a(this.iNn).get(paramInt);
    View localView1 = ed.b(this.iNn).inflate(k.bjG, paramViewGroup, false);
    ((TextView)localView1.findViewById(i.title)).setText(localei.iNs.iNt);
    ImageView localImageView = (ImageView)localView1.findViewById(i.icon);
    View localView2;
    TextView localTextView;
    View localView3;
    if (localei.iNs.icon > 0)
    {
      localImageView.setVisibility(0);
      localImageView.setImageResource(((ei)ed.a(this.iNn).get(paramInt)).iNs.icon);
      if (!ch.jb(localei.iNs.iNu))
        localImageView.setContentDescription(localei.iNs.iNu);
      localView2 = localView1.findViewById(i.aGf);
      localTextView = (TextView)localView1.findViewById(i.aTV);
      localView3 = localView1.findViewById(i.aGa);
      if (!localei.iNp)
        break label215;
      localView2.setVisibility(0);
    }
    while (true)
    {
      if (paramInt != -1 + getCount())
        break label317;
      localView1.setBackgroundResource(h.abv);
      return localView1;
      localImageView.setVisibility(8);
      break;
      label215: if (localei.iNr > 0)
      {
        localTextView.setVisibility(0);
        if (localei.iNr > 99)
          localTextView.setText(n.cmN);
        else
          localTextView.setText(localei.iNr);
      }
      else if (localei.iNq)
      {
        localView3.setVisibility(0);
      }
      else
      {
        localView2.setVisibility(8);
        localTextView.setVisibility(8);
        localView3.setVisibility(8);
      }
    }
    label317: localView1.setBackgroundResource(h.abu);
    return localView1;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.eg
 * JD-Core Version:    0.6.2
 */