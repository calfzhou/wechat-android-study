package com.tencent.mm.ui.pluginapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.model.at;
import com.tencent.mm.model.ax;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.pluginsdk.ui.c;
import com.tencent.mm.protocal.a.vt;
import com.tencent.mm.protocal.a.wz;
import com.tencent.mm.q.v;
import com.tencent.mm.ui.applet.f;
import com.tencent.mm.ui.base.MaskLayout;
import com.tencent.mm.ui.base.fi;
import java.util.LinkedList;

final class k extends BaseAdapter
{
  private com.tencent.mm.ui.applet.b dtE = new com.tencent.mm.ui.applet.b(new l(this));
  private f dtF = null;
  private Context mContext;

  public k(ContactSearchResultUI paramContactSearchResultUI, Context paramContext)
  {
    this.mContext = paramContext;
  }

  public final void detach()
  {
    if (this.dtE != null)
    {
      this.dtE.detach();
      this.dtE = null;
    }
  }

  public final int getCount()
  {
    if (ContactSearchResultUI.c(this.jKG) == null)
      return 0;
    return ContactSearchResultUI.c(this.jKG).size();
  }

  public final long getItemId(int paramInt)
  {
    return 0L;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (this.dtF == null)
      this.dtF = new m(this);
    if (this.dtE != null)
      this.dtE.a(paramInt, this.dtF);
    n localn;
    if (paramView == null)
    {
      paramView = View.inflate(this.mContext, com.tencent.mm.k.bdR, null);
      localn = new n(this, (byte)0);
      localn.eoy = ((MaskLayout)paramView.findViewById(i.aoy));
      localn.egA = ((TextView)paramView.findViewById(i.aoD));
      localn.jxv = ((TextView)paramView.findViewById(i.aoH));
      paramView.setTag(localn);
    }
    wz localwz;
    while (true)
    {
      localwz = qI(paramInt);
      if (localwz != null)
        break;
      if (localn.eoy != null)
      {
        ImageView localImageView = (ImageView)localn.eoy.getContentView();
        if (localImageView != null)
          localImageView.setImageDrawable(null);
      }
      if (localn.egA != null)
        localn.egA.setText("");
      if (localn.jxv != null)
        localn.jxv.setText("");
      return paramView;
      localn = (n)paramView.getTag();
    }
    c.a((ImageView)localn.eoy.getContentView(), localwz.hVf.getString());
    String str1;
    if (localwz.ifO != 0)
    {
      String str3 = at.qz().cJ(localwz.ifO);
      if (str3 != null)
      {
        Bitmap localBitmap = v.fJ(str3);
        localn.eoy.b(localBitmap, fi.jdH);
        str1 = ap.ja(localwz.dtg);
        if (str1.length() <= 0)
          break label460;
        localn.jxv.setVisibility(0);
      }
    }
    while (true)
    {
      Object localObject;
      try
      {
        TextView localTextView2 = localn.jxv;
        localTextView2.setText(com.tencent.mm.ar.b.e(this.mContext, str1, (int)localn.jxv.getTextSize()));
        try
        {
          TextView localTextView1 = localn.egA;
          Context localContext = this.mContext;
          if (ap.jb(localwz.ifj.getString()))
            break label473;
          localObject = localwz.ifj.getString();
          localTextView1.setText(com.tencent.mm.ar.b.e(localContext, (String)localObject, (int)localn.egA.getTextSize()));
          return paramView;
        }
        catch (Exception localException1)
        {
          localn.egA.setText("");
          return paramView;
        }
        localn.eoy.aTa();
        break;
        localn.eoy.aTa();
      }
      catch (Exception localException2)
      {
        localn.jxv.setText("");
        continue;
      }
      label460: localn.jxv.setVisibility(8);
      continue;
      label473: if (!ap.jb(localwz.dti))
      {
        localObject = localwz.dti;
      }
      else
      {
        String str2 = ap.ja(localwz.hVf.getString());
        localObject = str2;
      }
    }
  }

  public final void onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.dtE != null)
      this.dtE.onTouchEvent(paramMotionEvent);
  }

  public final wz qI(int paramInt)
  {
    if (ContactSearchResultUI.c(this.jKG) == null)
      return null;
    return (wz)ContactSearchResultUI.c(this.jKG).get(paramInt);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.pluginapp.k
 * JD-Core Version:    0.6.2
 */