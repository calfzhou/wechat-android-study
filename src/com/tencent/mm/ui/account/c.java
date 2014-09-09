package com.tencent.mm.ui.account;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import com.tencent.mm.h;
import com.tencent.mm.i;
import com.tencent.mm.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class c extends BaseAdapter
  implements Filterable
{
  private List fIM;
  private ArrayList fIO;
  private d iNK;
  private String iNL;
  private Context mContext;
  private final Object mLock = new Object();

  public c(Context paramContext, String[] paramArrayOfString, String paramString)
  {
    this.mContext = paramContext;
    this.fIM = Arrays.asList(paramArrayOfString);
    this.iNL = paramString;
  }

  private String hm(int paramInt)
  {
    return (String)this.fIM.get(paramInt);
  }

  public final int getCount()
  {
    return this.fIM.size();
  }

  public final Filter getFilter()
  {
    if (this.iNK == null)
      this.iNK = new d(this, (byte)0);
    return this.iNK;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    e locale2;
    if (paramView == null)
    {
      paramView = View.inflate(this.mContext, k.bbg, null);
      locale2 = new e();
      locale2.ekU = ((TextView)paramView.findViewById(i.aSH));
      paramView.setTag(locale2);
    }
    for (e locale1 = locale2; ; locale1 = (e)paramView.getTag())
    {
      String str = hm(paramInt);
      locale1.ekU.setText(str);
      paramView.setBackgroundResource(h.Uj);
      return paramView;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.c
 * JD-Core Version:    0.6.2
 */