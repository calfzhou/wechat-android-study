package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.k;
import java.util.HashMap;
import junit.framework.Assert;

final class g extends BaseAdapter
{
  private final Context context;
  protected final HashMap dhJ = new HashMap();
  private final int fyM;
  protected int fyO = -1;
  protected CharSequence[] jgw;
  protected CharSequence[] jgx;
  protected String value;

  public g(Context paramContext)
  {
    this.context = paramContext;
    this.fyM = 1;
  }

  protected final void aTD()
  {
    int i = 0;
    if (this.jgw == null)
      this.jgw = new CharSequence[0];
    if (this.jgx == null)
      this.jgx = new CharSequence[0];
    if (this.jgw.length == this.jgx.length);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue("entries count different", bool);
      this.dhJ.clear();
      while (i < this.jgx.length)
      {
        f localf = new f(this.jgw[i], 1048576 + i);
        this.dhJ.put(this.jgx[i], localf);
        i++;
      }
    }
  }

  public final int getCount()
  {
    return this.jgx.length;
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
    if (paramView == null)
    {
      paramView = View.inflate(this.context, k.bjk, null);
      h localh2 = new h();
      localh2.fyP = ((TextView)paramView.findViewById(i.text));
      localh2.fyQ = ((CheckBox)paramView.findViewById(i.amE));
      localh2.fyR = ((RadioButton)paramView.findViewById(i.aKe));
      paramView.setTag(localh2);
    }
    h localh1 = (h)paramView.getTag();
    localh1.fyP.setText(this.jgw[paramInt]);
    switch (this.fyM)
    {
    default:
      localh1.fyQ.setVisibility(8);
      localh1.fyR.setVisibility(8);
      return paramView;
    case 1:
      localh1.fyQ.setVisibility(8);
      localh1.fyR.setVisibility(0);
      localh1.fyR.setChecked(this.jgx[paramInt].equals(this.value));
      return paramView;
    case 2:
    }
    localh1.fyQ.setVisibility(0);
    localh1.fyR.setVisibility(8);
    localh1.fyQ.setChecked(this.jgx[paramInt].equals(this.value));
    return paramView;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.g
 * JD-Core Version:    0.6.2
 */