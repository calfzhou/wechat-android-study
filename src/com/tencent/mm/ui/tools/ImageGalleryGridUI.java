package com.tencent.mm.ui.tools;

import android.annotation.TargetApi;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.animation.DecelerateInterpolator;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.aw;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.tools.a.u;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class ImageGalleryGridUI extends MMActivity
  implements ViewTreeObserver.OnPreDrawListener, AdapterView.OnItemClickListener
{
  private String cEh;
  private GridView eCD;
  private TextView eWv;
  protected cm gQj;
  public int jRo;
  private List jRp;
  by jRq;
  private WeakReference jRr;
  private ArrayList jRs;
  private Boolean jRt;
  private Boolean jRu;
  private Runnable jRv = new cc(this);
  private Runnable jRw = new cd(this);
  Runnable jRx = new cj(this);
  public View jRy = null;

  private void bak()
  {
    int i = this.eCD.getFirstVisiblePosition();
    int j = this.eCD.getLastVisiblePosition();
    int k = this.jRo;
    if ((k >= i) && (k <= j))
      return;
    this.eCD.setSelection(k);
  }

  @TargetApi(11)
  private void qY(int paramInt)
  {
    Intent localIntent = getIntent();
    if (localIntent.getIntExtra("kintent_intent_source", 0) == 1);
    for (boolean bool = true; ; bool = false)
    {
      this.jRt = Boolean.valueOf(bool);
      this.cEh = localIntent.getStringExtra("kintent_talker");
      this.jRo = localIntent.getIntExtra("kintent_image_index", 0);
      this.jRs = localIntent.getIntegerArrayListExtra("kintent_downloaded_index_list");
      this.jRu = Boolean.valueOf(true);
      Bt(getString(com.tencent.mm.n.bsz));
      a(new ce(this));
      this.eWv = ((TextView)findViewById(i.afL));
      if (paramInt != 0)
        break label218;
      this.eCD = ((GridView)findViewById(i.axV));
      this.eCD.setOnItemClickListener(this);
      this.eCD.setNumColumns(3);
      this.jRp = bg.qW().oV().zu(this.cEh);
      if (this.jRp.size() != 0)
        break;
      return;
    }
    this.jRq = new by(this, this.jRp);
    this.eCD.setAdapter(this.jRq);
    bak();
    while (true)
    {
      this.eCD.setOnScrollListener(new cg(this));
      return;
      label218: if (this.jRq.getCount() != getIntent().getIntExtra("kintent_image_count", 0))
      {
        this.jRp = bg.qW().oV().zu(this.cEh);
        this.jRq = new by(this, this.jRp);
        this.eCD.setAdapter(this.jRq);
        bak();
      }
      else
      {
        bak();
        this.eCD.post(new cf(this));
      }
    }
  }

  private void t(View paramView, int paramInt)
  {
    Intent localIntent = new Intent(this, ImageGalleryUI.class);
    localIntent.putExtra("intent.key.with.footer", true);
    ar localar = (ar)this.jRq.getItem(paramInt);
    if (localar == null)
      return;
    int i = getResources().getConfiguration().orientation;
    int[] arrayOfInt = new int[2];
    int k;
    int j;
    if (paramView != null)
    {
      k = paramView.getWidth();
      j = paramView.getHeight();
      paramView.getLocationInWindow(arrayOfInt);
    }
    while (true)
    {
      localIntent.addFlags(536870912);
      localIntent.putExtra("img_gallery_msg_id", localar.kk()).putExtra("img_gallery_msg_svr_id", localar.kl()).putExtra("img_gallery_talker", localar.kt()).putExtra("img_gallery_chatroom_name", localar.kt()).putExtra("img_gallery_orientation", i);
      if (paramView != null)
        localIntent.putExtra("img_gallery_width", k).putExtra("img_gallery_height", j).putExtra("img_gallery_left", arrayOfInt[0]).putExtra("img_gallery_top", arrayOfInt[1]).putExtra("img_gallery_enter_from_grid", true);
      while (true)
      {
        startActivity(localIntent);
        overridePendingTransition(com.tencent.mm.b.Mz, 0);
        return;
        localIntent.putExtra("img_gallery_back_from_grid", true);
      }
      j = 0;
      k = 0;
    }
  }

  @TargetApi(11)
  public final void a(cb paramcb)
  {
    if (!this.jRu.booleanValue())
      return;
    this.jRu = Boolean.valueOf(false);
    if (Build.VERSION.SDK_INT >= 12);
    for (int i = 1; i == 0; i = 0)
    {
      paramcb.hyt.setVisibility(0);
      return;
    }
    this.jRr = new WeakReference(paramcb);
    paramcb.grk.getViewTreeObserver().addOnPreDrawListener(this);
  }

  protected final boolean aPD()
  {
    return true;
  }

  public final ArrayList bal()
  {
    return this.jRs;
  }

  protected final int getLayoutId()
  {
    return k.axV;
  }

  public void onBackPressed()
  {
    if (this.jRt.booleanValue())
    {
      super.onBackPressed();
      return;
    }
    t(null, this.jRo);
    finish();
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.gQj = new cm();
    u.cG(aPI()).bbv();
    qY(0);
  }

  protected void onDestroy()
  {
    this.gQj.removeCallbacks(this.jRw);
    this.gQj.removeCallbacks(this.jRv);
    this.gQj = null;
    super.onDestroy();
  }

  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    t(paramView, paramInt);
  }

  protected void onNewIntent(Intent paramIntent)
  {
    setIntent(paramIntent);
    super.onNewIntent(paramIntent);
    qY(1);
  }

  protected void onPause()
  {
    this.gQj.postDelayed(this.jRv, 501L);
    super.onPause();
  }

  public boolean onPreDraw()
  {
    cb localcb = (cb)this.jRr.get();
    if (localcb == null);
    View localView;
    DecelerateInterpolator localDecelerateInterpolator;
    do
    {
      int i;
      int j;
      do
      {
        ViewTreeObserver localViewTreeObserver;
        do
        {
          return true;
          localViewTreeObserver = localcb.grk.getViewTreeObserver();
        }
        while (!localViewTreeObserver.isAlive());
        localViewTreeObserver.removeOnPreDrawListener(this);
        i = localcb.grk.getMeasuredWidth();
        j = localcb.grk.getMeasuredHeight();
      }
      while ((i <= 0) || (j <= 0));
      RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)localcb.hyt.getLayoutParams();
      localLayoutParams.width = i;
      localLayoutParams.height = j;
      localcb.hyt.setLayoutParams(localLayoutParams);
      localView = localcb.hyt;
      localDecelerateInterpolator = new DecelerateInterpolator();
    }
    while (Build.VERSION.SDK_INT < 12);
    this.jRy = localView;
    this.gQj.postDelayed(new ci(this, localView, localDecelerateInterpolator), 700L);
    return true;
  }

  protected void onResume()
  {
    this.gQj.postDelayed(this.jRw, 300L);
    com.tencent.mm.plugin.f.c.n.fTF.d(11041, new Object[0]);
    super.onResume();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.ImageGalleryGridUI
 * JD-Core Version:    0.6.2
 */