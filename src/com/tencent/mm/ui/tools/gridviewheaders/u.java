package com.tencent.mm.ui.tools.gridviewheaders;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class u extends BaseAdapter
  implements b
{
  private t jWm;
  private List jWn;

  public u(t paramt)
  {
    this.jWm = paramt;
    paramt.registerDataSetObserver(new v(this, (byte)0));
    this.jWn = a(paramt);
  }

  protected final List a(t paramt)
  {
    HashMap localHashMap = new HashMap();
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < paramt.getCount(); i++)
    {
      long l = paramt.hF(i);
      w localw = (w)localHashMap.get(Long.valueOf(l));
      if (localw == null)
      {
        localw = new w(this, i);
        localArrayList.add(localw);
      }
      localw.bbq();
      localHashMap.put(Long.valueOf(l), localw);
    }
    return localArrayList;
  }

  public final int bbj()
  {
    return this.jWn.size();
  }

  public final View d(int paramInt, View paramView)
  {
    return this.jWm.d(((w)this.jWn.get(paramInt)).bbp(), paramView);
  }

  public final int getCount()
  {
    return this.jWm.getCount();
  }

  public final Object getItem(int paramInt)
  {
    return this.jWm.getItem(paramInt);
  }

  public final long getItemId(int paramInt)
  {
    return this.jWm.getItemId(paramInt);
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    return this.jWm.getView(paramInt, paramView, paramViewGroup);
  }

  public final int rm(int paramInt)
  {
    try
    {
      int i = ((w)this.jWn.get(paramInt)).getCount();
      return i;
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      localIndexOutOfBoundsException.toString();
    }
    return 0;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.gridviewheaders.u
 * JD-Core Version:    0.6.2
 */