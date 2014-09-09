package com.tencent.mm.ui.contact;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.aq.a;
import com.tencent.mm.h;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.aa;
import com.tencent.mm.n;
import com.tencent.mm.n.af;
import com.tencent.mm.n.c;
import com.tencent.mm.n.m;
import com.tencent.mm.n.p;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.o;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.Preference;
import java.io.ByteArrayOutputStream;
import junit.framework.Assert;

public class FriendPreference extends Preference
  implements p
{
  private MMActivity cHh;
  private TextView ejS;
  private com.tencent.mm.storage.i elz;
  private TextView fWR;
  private ImageView gHX;
  private boolean hHI;
  private String hlo;
  private long ijA;
  private ImageView jzP;
  private com.tencent.mm.modelfriend.i jzQ;
  private String jzR;
  private long jzS;
  private int jzT;

  public FriendPreference(Context paramContext)
  {
    super(paramContext);
    this.cHh = ((MMActivity)paramContext);
    init();
  }

  public FriendPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.cHh = ((MMActivity)paramContext);
    init();
  }

  public FriendPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setLayoutResource(com.tencent.mm.k.biA);
    setWidgetLayoutResource(com.tencent.mm.k.bjA);
    init();
  }

  private void DP()
  {
    if ((this.elz == null) || (!this.hHI))
      z.d("!44@/B4Tb64lLpLIDTV5Wa8lZnoG71g9jUqr/Z0lva2YW3s=", "initView : contact = " + this.elz + " bindView = " + this.hHI);
    do
    {
      do
      {
        do
        {
          return;
          if ((this.ijA == -1L) || (new com.tencent.mm.a.k(this.ijA).longValue() <= 0L))
            break;
          setWidgetLayoutResource(com.tencent.mm.k.bjB);
          if ((this.elz == null) || (!this.hHI))
          {
            z.d("!44@/B4Tb64lLpLIDTV5Wa8lZnoG71g9jUqr/Z0lva2YW3s=", "initView : contact = " + this.elz + " bindView = " + this.hHI);
            return;
          }
          this.jzT = 2;
          this.ejS.setText(getContext().getString(n.bBG));
          String str2 = ap.ja(this.jzR);
          String str3 = str2 + " " + new com.tencent.mm.a.k(this.ijA).longValue();
          this.fWR.setText(str3);
          Bitmap localBitmap5 = c.A(this.ijA);
          if (localBitmap5 == null)
            localBitmap5 = com.tencent.mm.platformtools.b.decodeStream(getContext().getResources().openRawResource(h.Ux));
          if (localBitmap5 != null)
          {
            Bitmap localBitmap6 = com.tencent.mm.sdk.platformtools.i.a(Bitmap.createScaledBitmap(localBitmap5, 48, 48, false), true, 0.0F);
            this.gHX.setImageBitmap(localBitmap6);
          }
        }
        while (bg.qW().isSDCardAvailable());
        this.gHX.setBackgroundDrawable(a.n(this.cHh, h.WL));
        return;
        if (this.jzQ == null)
          break;
        setWidgetLayoutResource(com.tencent.mm.k.bjv);
        if ((this.elz == null) || (!this.hHI))
        {
          z.d("!44@/B4Tb64lLpLIDTV5Wa8lZnoG71g9jUqr/Z0lva2YW3s=", "initView : contact = " + this.elz + " bindView = " + this.hHI);
          return;
        }
      }
      while (this.jzQ == null);
      this.jzT = 1;
      this.ejS.setText(getContext().getString(n.bBF));
      String str1 = ap.ja(this.jzQ.vw()) + " " + ap.ja(this.jzQ.vC()).replace(" ", "");
      this.fWR.setText(str1);
      Bitmap localBitmap3 = aa.c(this.jzQ.vv(), getContext());
      if (localBitmap3 == null)
        this.gHX.setImageDrawable(a.n(this.cHh, h.Uv));
      while (bg.qW().oT().yo(this.jzQ.getUsername()))
      {
        this.jzP.setOnClickListener(new cr(this, str1));
        return;
        Bitmap localBitmap4 = com.tencent.mm.sdk.platformtools.i.a(Bitmap.createScaledBitmap(localBitmap3, 48, 48, false), true, 0.0F);
        this.gHX.setImageBitmap(localBitmap4);
      }
      this.jzP.setVisibility(4);
      return;
      if (this.jzS <= 0L)
        break;
      if ((this.elz == null) || (!this.hHI))
      {
        z.d("!44@/B4Tb64lLpLIDTV5Wa8lZnoG71g9jUqr/Z0lva2YW3s=", "initView : contact = " + this.elz + " bindView = " + this.hHI);
        return;
      }
      this.jzT = 3;
      this.ejS.setText(getContext().getString(n.bNy));
      this.fWR.setText(ap.ja(this.elz.jr()));
      Bitmap localBitmap1 = c.eH(this.jzS);
      if (localBitmap1 == null)
        localBitmap1 = com.tencent.mm.platformtools.b.decodeStream(getContext().getResources().openRawResource(h.Ux));
      if (localBitmap1 != null)
      {
        Bitmap localBitmap2 = com.tencent.mm.sdk.platformtools.i.a(Bitmap.createScaledBitmap(localBitmap1, 48, 48, false), true, 0.0F);
        this.gHX.setImageBitmap(localBitmap2);
      }
    }
    while (bg.qW().isSDCardAvailable());
    this.gHX.setBackgroundDrawable(a.n(this.cHh, h.WL));
    return;
    if (!TextUtils.isEmpty(this.hlo))
    {
      if ((this.elz == null) || (!this.hHI))
      {
        z.d("!44@/B4Tb64lLpLIDTV5Wa8lZnoG71g9jUqr/Z0lva2YW3s=", "initView : contact = " + this.elz + " bindView = " + this.hHI);
        return;
      }
      this.jzT = 3;
      this.ejS.setText(getContext().getString(n.bXX));
      this.fWR.setText(ap.ja(this.hlo));
      this.gHX.setVisibility(8);
      return;
    }
    Assert.assertTrue(false);
  }

  private void init()
  {
    this.hHI = false;
    this.elz = null;
    this.jzQ = null;
    this.jzR = "";
    this.ijA = 0L;
    this.jzS = 0L;
    this.jzT = 0;
    this.hlo = "";
  }

  private boolean s(String paramString, Bitmap paramBitmap)
  {
    if (paramBitmap != null)
    {
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      paramBitmap.compress(Bitmap.CompressFormat.PNG, 100, localByteArrayOutputStream);
      return aa.a(paramString, getContext(), localByteArrayOutputStream.toByteArray());
    }
    return false;
  }

  public final boolean ID()
  {
    af.sh().e(this);
    return true;
  }

  public final void eX(String paramString)
  {
    long l = c.eJ(paramString);
    if ((l > 0L) && (this.ijA == l) && (c.a(paramString, false, -1) != null))
      DP();
    if ((c.eI(paramString) == this.jzS) && (c.a(paramString, false, -1) != null))
      DP();
  }

  public final void onBindView(View paramView)
  {
    this.ejS = ((TextView)paramView.findViewById(com.tencent.mm.i.title));
    this.fWR = ((TextView)paramView.findViewById(com.tencent.mm.i.summary));
    this.gHX = ((ImageView)paramView.findViewById(com.tencent.mm.i.ayb));
    this.jzP = ((ImageView)paramView.findViewById(com.tencent.mm.i.aEN));
    this.hHI = true;
    DP();
    super.onBindView(paramView);
  }

  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    View localView = super.onCreateView(paramViewGroup);
    LayoutInflater localLayoutInflater = (LayoutInflater)getContext().getSystemService("layout_inflater");
    ViewGroup localViewGroup = (ViewGroup)localView.findViewById(com.tencent.mm.i.content);
    localViewGroup.removeAllViews();
    localLayoutInflater.inflate(com.tencent.mm.k.biQ, localViewGroup);
    return localView;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.FriendPreference
 * JD-Core Version:    0.6.2
 */