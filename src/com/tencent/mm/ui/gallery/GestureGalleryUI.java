package com.tencent.mm.ui.gallery;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Gallery.LayoutParams;
import com.tencent.mm.k;
import com.tencent.mm.model.aa;
import com.tencent.mm.model.ad;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.platformtools.o;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMGallery;
import com.tencent.mm.ui.tools.MMGestureGallery;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GestureGalleryUI extends MMActivity
  implements View.OnTouchListener, ad
{
  private MMGallery faG;
  private MMGestureGallery faH;
  float faI = 0.0F;
  float faJ = 0.0F;
  boolean faK = false;
  float faL = 1.0F;
  private aa faM;
  private List faN = new ArrayList();
  private int faO = -1;
  private AdapterView.OnItemSelectedListener faP = new h(this);
  private i jJG;
  private String jJH;
  private int type = 0;

  protected final void DP()
  {
    String str1 = ap.ja(getIntent().getStringExtra("nowUrl"));
    this.type = getIntent().getIntExtra("type", 0);
    String[] arrayOfString = getIntent().getStringArrayExtra("urlList");
    String str2;
    int i;
    if ((arrayOfString == null) || (arrayOfString.length == 0))
    {
      str2 = ap.ja(getIntent().getStringExtra("htmlData"));
      i = 0;
    }
    while (i >= 0)
    {
      int m = str2.indexOf("weixin://viewimage/", i);
      if (m >= 0)
      {
        i = str2.indexOf("\"", m);
        if (i >= 0)
        {
          String str3 = str2.substring(m + 19, i);
          z.d("!44@/B4Tb64lLpI3qghlmlMkBkqieoUTg8Us2r04Hi9+F7o=", "start:" + m + " end:" + i + " url:" + str3);
          this.faN.add(str3);
          continue;
          this.faN = Arrays.asList(arrayOfString);
        }
      }
    }
    int j = 0;
    label317: int k;
    if (j < this.faN.size())
    {
      if (str1.equals(this.faN.get(j)))
        this.faO = j;
    }
    else
    {
      a(new a(this));
      this.jJG = new i(this);
      if (!o.Dx())
        break label359;
      this.faH = ((MMGestureGallery)findViewById(com.tencent.mm.i.auH));
      this.faH.setVisibility(0);
      this.faH.setVerticalFadingEdgeEnabled(false);
      this.faH.setHorizontalFadingEdgeEnabled(false);
      this.faH.setAdapter(this.jJG);
      this.faH.setSelection(this.faO);
      this.faH.setOnItemSelectedListener(this.faP);
      k = getIntent().getIntExtra("nevNext", 1);
      if (1 != k)
        break label417;
      a(0, com.tencent.mm.h.WS, new b(this));
    }
    label359: 
    while (2 != k)
    {
      return;
      j++;
      break;
      this.faG = ((MMGallery)findViewById(com.tencent.mm.i.auI));
      this.faG.setVisibility(0);
      this.faG.setAdapter(this.jJG);
      this.faG.setSelection(this.faO);
      this.faG.setOnItemSelectedListener(this.faP);
      break label317;
    }
    label417: a(0, com.tencent.mm.h.Yi, new c(this));
  }

  protected final int getLayoutId()
  {
    return k.blf;
  }

  public final void i(String paramString, int paramInt)
  {
    if (this.jJG != null)
      if (!o.Dx())
        break label46;
    label46: for (int i = this.faH.getSelectedItemPosition(); ; i = this.faG.getSelectedItemPosition())
    {
      if (paramInt == i)
        this.jJH = aa.h(paramString, this.type);
      this.jJG.notifyDataSetChanged();
      return;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.faM = new aa();
    DP();
  }

  public void onDestroy()
  {
    super.onDestroy();
    this.faM.qt();
  }

  public void onPause()
  {
    super.onPause();
    aa localaa = this.faM;
    z.d("!32@/B4Tb64lLpINwg6pdiU5D99hnbItqI3s", "removeListener :" + hashCode());
    localaa.dkr = null;
  }

  public void onResume()
  {
    super.onResume();
    aa localaa = this.faM;
    z.d("!32@/B4Tb64lLpINwg6pdiU5D99hnbItqI3s", "addListener :" + hashCode());
    localaa.dkr = this;
  }

  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    int i = 1;
    z.d("!44@/B4Tb64lLpI3qghlmlMkBkqieoUTg8Us2r04Hi9+F7o=", "Main onTouch event.getAction():" + paramMotionEvent.getAction());
    switch (0xFF & paramMotionEvent.getAction())
    {
    case 3:
    case 4:
    default:
    case 5:
    case 2:
    case 6:
    }
    while (true)
    {
      i = 0;
      float f1;
      do
      {
        return i;
        this.faI = o.i(paramMotionEvent);
        if (this.faI <= 5.0F)
          break;
        this.faK = i;
        break;
        if (!this.faK)
          break;
        this.faJ = o.i(paramMotionEvent);
        if (this.faJ < 5.0F)
          break;
        f1 = this.faJ - this.faI;
        if (f1 == 0.0F)
          break;
      }
      while (Math.abs(f1) <= 5.0F);
      float f2 = f1 / 854.0F;
      ScaleAnimation localScaleAnimation = new ScaleAnimation(this.faL, f2 + this.faL, this.faL, f2 + this.faL, i, 0.5F, i, 0.5F);
      localScaleAnimation.setDuration(100L);
      localScaleAnimation.setFillAfter(i);
      localScaleAnimation.setFillEnabled(i);
      this.faL = (f2 + this.faL);
      this.faG.getSelectedView().setLayoutParams(new Gallery.LayoutParams((int)(480.0F * this.faL), (int)(854.0F * this.faL)));
      this.faI = this.faJ;
      return i;
      this.faK = false;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.gallery.GestureGalleryUI
 * JD-Core Version:    0.6.2
 */