package com.tencent.mm.ui.contact.profile;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.h;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.y;
import com.tencent.mm.n;
import com.tencent.mm.n.af;
import com.tencent.mm.n.c;
import com.tencent.mm.n.m;
import com.tencent.mm.n.p;
import com.tencent.mm.q.aa;
import com.tencent.mm.q.r;
import com.tencent.mm.q.v;
import com.tencent.mm.q.w;
import com.tencent.mm.q.x;
import com.tencent.mm.sdk.f.as;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.o;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.Preference;
import junit.framework.Assert;

public class BizInfoHeaderPreference extends Preference
  implements p, x, as
{
  private MMActivity cHh;
  private com.tencent.mm.storage.i elz;
  private boolean hHI = false;
  private ImageView hHs;
  private TextView hHt;
  private TextView hHu;
  private ImageView jCI;
  private View jCJ;
  private String jCK;

  public BizInfoHeaderPreference(Context paramContext)
  {
    super(paramContext);
    this.cHh = ((MMActivity)paramContext);
    this.hHI = false;
  }

  public BizInfoHeaderPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.cHh = ((MMActivity)paramContext);
    this.hHI = false;
  }

  public BizInfoHeaderPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.cHh = ((MMActivity)paramContext);
    this.hHI = false;
  }

  private void DP()
  {
    if (!aDe())
    {
      z.w("!56@/B4Tb64lLpJBvWFKDfNn3WL8Bjppw9hzyhjqpu58LlnVsv8IClP3eA==", "initView : bindView = " + this.hHI + "contact = " + this.elz);
      return;
    }
    TextView localTextView = this.hHt;
    localTextView.setText(com.tencent.mm.ar.b.e(this.cHh, com.tencent.mm.platformtools.ap.ja(this.elz.oc()) + " ", (int)this.hHt.getTextSize()));
    Bitmap localBitmap;
    if (!TextUtils.isEmpty(this.jCK))
    {
      localBitmap = v.b(this.elz.getUsername(), this.jCK, h.Xu);
      if (localBitmap == null)
        localBitmap = BitmapFactory.decodeResource(this.cHh.getResources(), h.SW);
      if ((localBitmap != null) && (!localBitmap.isRecycled()))
        this.hHs.setImageBitmap(localBitmap);
      this.hHs.setTag(this.elz.getUsername());
      this.jCJ.setOnClickListener(new a(this));
      if (!com.tencent.mm.g.a.cv(this.elz.getType()))
        break label478;
      if (com.tencent.mm.platformtools.ap.jb(this.elz.iS()))
        break label382;
      this.hHu.setVisibility(0);
      this.hHu.setText(getContext().getString(n.btu) + this.elz.iS());
    }
    label478: 
    while (true)
    {
      if (!this.elz.zV())
        break label490;
      this.jCI.setVisibility(0);
      return;
      com.tencent.mm.q.a locala = r.fE(this.elz.getUsername());
      if (locala != null)
      {
        this.jCK = locala.field_brandIconURL;
        localBitmap = v.b(locala.field_username, locala.field_brandIconURL, h.Xu);
        break;
      }
      localBitmap = c.a(this.elz.getUsername(), true, -1);
      if ((localBitmap == null) || (localBitmap.isRecycled()))
        break;
      localBitmap = com.tencent.mm.sdk.platformtools.i.a(localBitmap, false, localBitmap.getWidth() / 2);
      break;
      label382: if ((!com.tencent.mm.storage.i.yd(this.elz.getUsername())) && (!y.df(this.elz.getUsername())))
      {
        String str = com.tencent.mm.platformtools.ap.ja(this.elz.Aa());
        this.hHu.setText(getContext().getString(n.btu) + str);
        this.hHu.setVisibility(0);
      }
      else
      {
        this.hHu.setVisibility(8);
        continue;
        this.hHu.setVisibility(8);
      }
    }
    label490: this.jCI.setVisibility(8);
  }

  private boolean aDe()
  {
    return (this.hHI) && (this.elz != null);
  }

  public final void a(int paramInt, com.tencent.mm.sdk.f.ap paramap, Object paramObject)
  {
    if (!aDe())
      z.e("!56@/B4Tb64lLpJBvWFKDfNn3WL8Bjppw9hzyhjqpu58LlnVsv8IClP3eA==", "initView : bindView = " + this.hHI + "contact = " + this.elz);
    String str;
    do
    {
      return;
      str = (String)paramObject;
    }
    while ((com.tencent.mm.platformtools.ap.ja(str).length() <= 0) || (this.elz == null) || (!this.elz.getUsername().equals(str)));
    this.elz = bg.qW().oT().ys(str);
  }

  public final void d(com.tencent.mm.storage.i parami, String paramString)
  {
    this.jCK = paramString;
    onDetach();
    bg.qW().oT().a(this);
    af.sh().d(this);
    aa.uZ().a(this);
    this.elz = parami;
    if (com.tencent.mm.platformtools.ap.ja(parami.getUsername()).length() > 0);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue("initView: contact username is null", bool);
      DP();
      return;
    }
  }

  public final void eX(String paramString)
  {
    if (!aDe())
      z.e("!56@/B4Tb64lLpJBvWFKDfNn3WL8Bjppw9hzyhjqpu58LlnVsv8IClP3eA==", "initView : bindView = " + this.hHI + "contact = " + this.elz);
    do
    {
      return;
      if (com.tencent.mm.platformtools.ap.ja(paramString).length() <= 0)
      {
        z.e("!56@/B4Tb64lLpJBvWFKDfNn3WL8Bjppw9hzyhjqpu58LlnVsv8IClP3eA==", "notifyChanged: user = " + paramString);
        return;
      }
    }
    while (!paramString.equals(this.elz.getUsername()));
    DP();
  }

  public final void fM(String paramString)
  {
    if ((this.elz != null) && (paramString != null) && (paramString.equals(this.elz.getUsername())))
      DP();
  }

  public final void onBindView(View paramView)
  {
    z.d("!56@/B4Tb64lLpJBvWFKDfNn3WL8Bjppw9hzyhjqpu58LlnVsv8IClP3eA==", "onBindView");
    this.hHt = ((TextView)paramView.findViewById(com.tencent.mm.i.anT));
    this.hHu = ((TextView)paramView.findViewById(com.tencent.mm.i.aok));
    this.jCI = ((ImageView)paramView.findViewById(com.tencent.mm.i.ajs));
    this.hHs = ((ImageView)paramView.findViewById(com.tencent.mm.i.anA));
    this.jCJ = paramView.findViewById(com.tencent.mm.i.anB);
    this.hHI = true;
    DP();
    super.onBindView(paramView);
  }

  public final void onDetach()
  {
    bg.qW().oT().b(this);
    af.sh().e(this);
    aa.uZ().b(this);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.BizInfoHeaderPreference
 * JD-Core Version:    0.6.2
 */