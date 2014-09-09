package com.tencent.mm.ui.chatting;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.text.TextPaint;
import android.view.Display;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import com.tencent.mm.f;
import com.tencent.mm.g;
import com.tencent.mm.k;
import com.tencent.mm.o;
import com.tencent.mm.ui.base.MMListPopupWindow;
import java.util.List;

public final class av
  implements View.OnKeyListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener
{
  private LayoutInflater gJ;
  private int height;
  private AdapterView.OnItemClickListener jno = null;
  private ViewGroup jnp = null;
  private ay jnq = null;
  private MMListPopupWindow jnr;
  private int jns = o.cuJ;
  private int jnt;
  private com.tencent.mm.q.h jnu = null;
  private boolean jnv = true;
  private Context mContext = null;
  private int mCount;

  public av(Context paramContext, ViewGroup paramViewGroup)
  {
    this.mContext = paramContext;
    this.jnp = paramViewGroup;
    this.gJ = ((LayoutInflater)paramContext.getSystemService("layout_inflater"));
    aUE();
    this.jnq = new ay(this, (byte)0);
  }

  private int a(ListAdapter paramListAdapter)
  {
    int i = View.MeasureSpec.makeMeasureSpec(0, 0);
    int j = View.MeasureSpec.makeMeasureSpec(0, 0);
    int k = paramListAdapter.getCount();
    int m = 0;
    int n = 0;
    View localView1 = null;
    int i1 = 0;
    int i2;
    if (m < k)
    {
      i2 = paramListAdapter.getItemViewType(m);
      if (i2 == n)
        break label129;
    }
    for (View localView2 = null; ; localView2 = localView1)
    {
      if (this.jnp == null)
        this.jnp = new FrameLayout(this.mContext);
      localView1 = paramListAdapter.getView(m, localView2, this.jnp);
      localView1.measure(i, j);
      i1 = Math.max(i1, localView1.getMeasuredWidth());
      m++;
      n = i2;
      break;
      return i1;
      label129: i2 = n;
    }
  }

  @SuppressLint({"WrongCall"})
  private boolean a(com.tencent.mm.q.h paramh, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if ((!isShowing()) && (paramh != null) && (paramh.dqr != null) && (paramh.dqr.size() > 0))
    {
      if ((this.jnu == null) || (this.jnu.id != paramh.id) || (!this.jnu.dqq.equals(paramh.dqq)) || (this.jnv))
      {
        this.jnv = false;
        this.jnu = paramh;
        this.mCount = paramh.dqr.size();
        this.jnq.notifyDataSetChanged();
      }
      this.height = ((WindowManager)this.mContext.getSystemService("window")).getDefaultDisplay().getHeight();
      TextView localTextView = (TextView)((LayoutInflater)this.mContext.getSystemService("layout_inflater")).inflate(k.bci, null);
      Context localContext = this.mContext;
      TextPaint localTextPaint = localTextView.getPaint();
      List localList = paramh.dqr;
      ax localax = aw.a(localContext, localTextPaint, localList, paramInt1);
      this.jnt = (paramInt2 - this.jnq.getCount() * this.mContext.getResources().getDimensionPixelSize(g.PN) - this.mContext.getResources().getDimensionPixelSize(g.Py));
      new StringBuilder("showPointY=").append(paramInt2).append("verticalOffset=").append(this.jnt);
      this.jnr = new MMListPopupWindow(this.mContext, null, 0);
      this.jnr.setOnDismissListener(this);
      this.jnr.setOnItemClickListener(this.jno);
      this.jnr.setAdapter(this.jnq);
      this.jnr.cT();
      this.jnr.setBackgroundDrawable(this.mContext.getResources().getDrawable(com.tencent.mm.h.abt));
      this.jnr.setAnimationStyle(this.jns);
      this.jnr.setHorizontalOffset(localax.jny);
      this.jnr.setVerticalOffset(this.jnt);
      this.jnr.setAnchorView(this.jnp);
      this.jnr.setContentWidth(a(this.jnq));
      this.jnr.cU();
      this.jnr.show();
      this.jnr.getListView().setOnKeyListener(this);
      this.jnr.getListView().setDivider(new ColorDrawable(this.mContext.getResources().getColor(f.OS)));
      this.jnr.getListView().setSelector(this.mContext.getResources().getDrawable(com.tencent.mm.h.TT));
      this.jnr.getListView().setDividerHeight(1);
      this.jnr.getListView().setVerticalScrollBarEnabled(false);
      this.jnr.getListView().setHorizontalScrollBarEnabled(false);
      return true;
    }
    return false;
  }

  private boolean isShowing()
  {
    return (this.jnr != null) && (this.jnr.isShowing());
  }

  public final boolean a(com.tencent.mm.q.h paramh, int paramInt1, int paramInt2)
  {
    boolean bool;
    if (!isShowing())
      bool = a(paramh, paramInt1, paramInt2, false);
    do
    {
      return bool;
      bool = aUE();
    }
    while ((paramh == null) || ((this.jnu.id == paramh.id) && (this.jnu.dqq.equals(paramh.dqq))));
    return bool & a(paramh, paramInt1, paramInt2, false);
  }

  public final boolean aUE()
  {
    if (isShowing())
    {
      this.jnr.dismiss();
      return true;
    }
    return false;
  }

  public final void onDismiss()
  {
  }

  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
  }

  public final boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    return false;
  }

  public final void setOnItemClickListener(AdapterView.OnItemClickListener paramOnItemClickListener)
  {
    this.jno = paramOnItemClickListener;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.av
 * JD-Core Version:    0.6.2
 */