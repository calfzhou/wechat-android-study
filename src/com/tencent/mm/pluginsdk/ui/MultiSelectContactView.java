package com.tencent.mm.pluginsdk.ui;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.mm.b;
import com.tencent.mm.g;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.y;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.e;
import com.tencent.mm.sdk.platformtools.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MultiSelectContactView extends LinearLayout
{
  private LayoutInflater fpT;
  private HorizontalScrollView hyT;
  private LinearLayout hyU;
  private View hyV;
  private EditText hyW;
  private List hyX;
  private Animation hyY;
  private int hyZ = 0;
  private View hza;
  private ao hzb;
  private ap hzc;
  private aq hzd;
  private List hze;
  boolean hzf = false;
  private int padding = 0;

  public MultiSelectContactView(Context paramContext)
  {
    this(paramContext, null);
  }

  public MultiSelectContactView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.fpT = LayoutInflater.from(paramContext);
    this.fpT.inflate(k.bjW, this, true);
    this.hyT = ((HorizontalScrollView)findViewById(i.aFo));
    this.hyW = ((EditText)findViewById(i.aFn));
    this.hyU = ((LinearLayout)findViewById(i.aFm));
    this.hyV = findViewById(i.aFp);
    this.hyX = new LinkedList();
    this.hyY = AnimationUtils.loadAnimation(paramContext, b.Mv);
    this.hza = findViewById(i.aMC);
    this.hyW.addTextChangedListener(new ae(this));
    this.hyW.setOnKeyListener(new af(this));
    this.hze = new ArrayList();
    this.hyW.clearFocus();
    this.hyW.setOnFocusChangeListener(new ag(this));
    setBackgroundColor(-201326593);
    setOnClickListener(new ah(this));
  }

  private void a(View paramView, boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((paramBoolean1) && (this.hzb != null))
      this.hzb.vs(paramView.getTag().toString());
    if (paramBoolean2)
    {
      Animation localAnimation = AnimationUtils.loadAnimation(getContext(), b.Mw);
      localAnimation.setAnimationListener(new al(this, paramView));
      paramView.startAnimation(localAnimation);
      return;
    }
    this.hyU.removeView(paramView);
    aAm();
    mt(this.hyU.getChildCount());
  }

  private void aAk()
  {
    if (this.hyU.getChildCount() == 0);
    while (!this.hzf)
      return;
    View localView = this.hyU.getChildAt(-1 + this.hyU.getChildCount());
    this.hzf = false;
    localView.findViewById(i.Iy).setVisibility(8);
  }

  private void aAl()
  {
    this.hyU.post(new an(this));
  }

  private void aAm()
  {
    if (this.hyU.getChildCount() == 0)
    {
      this.hyV.setVisibility(0);
      return;
    }
    this.hyV.setVisibility(8);
  }

  private void mt(int paramInt)
  {
    if (this.hyZ <= 0)
    {
      this.hyZ += getResources().getDimensionPixelSize(g.PB);
      int k = e.a(getContext(), 40.0F);
      int m = (int)this.hyW.getPaint().measureText(getContext().getString(n.bug));
      this.hyZ += Math.max(k, m);
    }
    if (this.hyZ <= 0)
      return;
    int i = this.hza.getWidth();
    int j = paramInt * (getResources().getDimensionPixelSize(g.Po) + getResources().getDimensionPixelSize(g.Pj));
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(i);
    arrayOfObject[1] = Integer.valueOf(j);
    arrayOfObject[2] = Integer.valueOf(this.hyZ);
    z.v("!56@/B4Tb64lLpIV90IJEnqSdLjmnZq8oppFW6wgwrHFfV7MdTncY5Eqng==", "parentWidth:%d, avatarWidth:%d, minInputAreaWidth:%d", arrayOfObject);
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)this.hyT.getLayoutParams();
    if (i - j > this.hyZ)
    {
      localLayoutParams.width = -2;
      return;
    }
    localLayoutParams.width = (i - this.hyZ);
  }

  public final void a(ao paramao)
  {
    this.hzb = paramao;
  }

  public final void a(ap paramap)
  {
    this.hzc = paramap;
  }

  public final void a(aq paramaq)
  {
    this.hzd = paramaq;
  }

  public final int aAj()
  {
    return this.hyU.getChildCount();
  }

  public final String aAn()
  {
    return this.hyW.getText().toString();
  }

  public final void aAo()
  {
    this.hyW.setText("");
  }

  public final void aU(List paramList)
  {
    if (paramList == null)
      return;
    this.hyX.addAll(paramList);
  }

  public final void aV(List paramList)
  {
    if ((paramList == null) || (paramList.size() == 0))
      return;
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      View localView = this.fpT.inflate(k.bmz, null, true);
      ImageView localImageView = (ImageView)localView.findViewById(i.aha);
      c.a(localImageView, str);
      localImageView.setContentDescription(y.dh(str));
      localView.setTag(str);
      localView.setOnClickListener(new ai(this));
      localView.startAnimation(this.hyY);
      this.hyU.addView(localView);
      aAm();
      LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)localView.getLayoutParams();
      localLayoutParams.height = getResources().getDimensionPixelSize(g.Po);
      localLayoutParams.width = getResources().getDimensionPixelSize(g.Po);
      localLayoutParams.rightMargin = getResources().getDimensionPixelSize(g.Pj);
      localView.setLayoutParams(localLayoutParams);
    }
    post(new aj(this));
  }

  public void clearFocus()
  {
    this.hyW.clearFocus();
    aAk();
  }

  public final void vp(String paramString)
  {
    if (ch.jb(paramString))
      return;
    if (this.hyX.contains(paramString))
    {
      z.i("!56@/B4Tb64lLpIV90IJEnqSdLjmnZq8oppFW6wgwrHFfV7MdTncY5Eqng==", "fixed user cant change");
      return;
    }
    aAk();
    int i = this.hyU.getChildCount();
    int j = 0;
    View localView1;
    if (j < i)
    {
      localView1 = this.hyU.getChildAt(j);
      if (!paramString.equals(localView1.getTag()));
    }
    while (true)
    {
      if (localView1 == null)
        break label98;
      a(localView1, false, false);
      return;
      j++;
      break;
      localView1 = null;
    }
    label98: mt(1 + this.hyU.getChildCount());
    View localView2 = this.fpT.inflate(k.bmz, null, true);
    ImageView localImageView = (ImageView)localView2.findViewById(i.aha);
    c.a(localImageView, paramString);
    localImageView.setContentDescription(y.dh(paramString));
    localView2.setTag(paramString);
    localView2.setOnClickListener(new ak(this));
    localView2.startAnimation(this.hyY);
    this.hyU.addView(localView2);
    aAm();
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)localView2.getLayoutParams();
    localLayoutParams.height = getResources().getDimensionPixelSize(g.Po);
    localLayoutParams.width = getResources().getDimensionPixelSize(g.Po);
    localLayoutParams.rightMargin = getResources().getDimensionPixelSize(g.Pj);
    localView2.setLayoutParams(localLayoutParams);
    aAl();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.MultiSelectContactView
 * JD-Core Version:    0.6.2
 */