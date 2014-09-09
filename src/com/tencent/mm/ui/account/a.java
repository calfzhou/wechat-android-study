package com.tencent.mm.ui.account;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.mm.h;
import com.tencent.mm.i;
import com.tencent.mm.k;

public final class a extends BaseAdapter
{
  private LayoutInflater fpT;
  private String[] iNG;
  private Drawable iNH = null;
  private View.OnTouchListener iNI = new b(this);

  public a(Context paramContext, String[] paramArrayOfString)
  {
    this.iNG = paramArrayOfString;
    this.fpT = LayoutInflater.from(paramContext);
    this.iNH = paramContext.getResources().getDrawable(h.aaL);
    this.iNH.setBounds(0, 0, this.iNH.getIntrinsicWidth(), this.iNH.getIntrinsicHeight());
  }

  private boolean pc(int paramInt)
  {
    return paramInt == -1 + this.iNG.length;
  }

  public final int getCount()
  {
    return this.iNG.length;
  }

  public final Object getItem(int paramInt)
  {
    return this.iNG[paramInt];
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    int i = 1;
    if (paramView == null)
      paramView = this.fpT.inflate(k.baJ, null);
    TextView localTextView = (TextView)paramView.findViewById(i.afO);
    paramView.setOnTouchListener(this.iNI);
    int j;
    if (paramInt == 0)
    {
      j = i;
      if ((j == 0) || (!pc(paramInt)))
        break label106;
      localTextView.setPadding(25, 0, 25, 10);
      localTextView.setCompoundDrawablePadding(0);
      localTextView.setCompoundDrawables(null, null, null, null);
    }
    while (true)
    {
      localTextView.setText(this.iNG[paramInt]);
      return paramView;
      j = 0;
      break;
      label106: if (paramInt == 0);
      while (true)
      {
        if (i == 0)
          break label155;
        localTextView.setPadding(25, 0, 10, 10);
        localTextView.setCompoundDrawablePadding(10);
        localTextView.setCompoundDrawables(null, null, this.iNH, null);
        break;
        i = 0;
      }
      label155: if (pc(paramInt))
      {
        localTextView.setPadding(0, 0, 25, 10);
        localTextView.setCompoundDrawablePadding(0);
        localTextView.setCompoundDrawables(null, null, null, null);
      }
      else
      {
        localTextView.setPadding(0, 0, 10, 10);
        localTextView.setCompoundDrawablePadding(10);
        localTextView.setCompoundDrawables(null, null, this.iNH, null);
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.a
 * JD-Core Version:    0.6.2
 */