package com.tencent.mm.ui.contact.profile;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.h;
import com.tencent.mm.n;
import com.tencent.mm.n.af;
import com.tencent.mm.n.c;
import com.tencent.mm.n.m;
import com.tencent.mm.n.p;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.tools.gx;
import junit.framework.Assert;

public class HelperHeaderPreference extends Preference
  implements p
{
  private ImageView dXf;
  private com.tencent.mm.storage.i elz;
  private TextView fFM;
  private TextView gGk;
  private TextView jAg;
  private cb jEc;
  private boolean jiT = false;

  public HelperHeaderPreference(Context paramContext)
  {
    super(paramContext);
  }

  public HelperHeaderPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public HelperHeaderPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  private void DP()
  {
    if ((!this.jiT) || (this.elz == null))
      z.w("!44@/B4Tb64lLpJsz/wnDvcw99L3WPDxOmNkfKnAuGIJF2I=", "initView : bindView = " + this.jiT + "contact = " + this.elz);
    do
    {
      return;
      eN(this.elz.getUsername());
      if (this.gGk != null)
        this.gGk.setText(this.elz.oc());
    }
    while (this.jEc == null);
    this.jEc.a(this);
    CharSequence localCharSequence = this.jEc.getHint();
    if (localCharSequence != null)
    {
      this.jAg.setText(localCharSequence);
      this.jAg.setVisibility(0);
      return;
    }
    this.jAg.setVisibility(8);
  }

  private void eN(String paramString)
  {
    z.d("!44@/B4Tb64lLpJsz/wnDvcw99L3WPDxOmNkfKnAuGIJF2I=", "updateAvatar : user = " + paramString);
    if ((this.dXf != null) && (this.elz.getUsername().equals(paramString)))
      this.dXf.setImageBitmap(c.a(paramString, false, -1));
  }

  public final void a(com.tencent.mm.storage.i parami, cb paramcb)
  {
    onDetach();
    if (parami != null);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      af.sh().d(this);
      this.elz = parami;
      this.jEc = paramcb;
      DP();
      return;
    }
  }

  public final void eX(String paramString)
  {
    eN(paramString);
  }

  public final void fJ(boolean paramBoolean)
  {
    if (this.jEc == null)
      return;
    if (paramBoolean)
    {
      this.fFM.setTextColor(gx.cE(getContext()));
      this.fFM.setText(n.cgu);
      this.fFM.setCompoundDrawablesWithIntrinsicBounds(h.abr, 0, 0, 0);
      return;
    }
    this.fFM.setTextColor(gx.cF(getContext()));
    this.fFM.setText(n.cgA);
    this.fFM.setCompoundDrawablesWithIntrinsicBounds(h.abq, 0, 0, 0);
  }

  public final void onBindView(View paramView)
  {
    this.dXf = ((ImageView)paramView.findViewById(com.tencent.mm.i.anA));
    this.fFM = ((TextView)paramView.findViewById(com.tencent.mm.i.aoj));
    this.gGk = ((TextView)paramView.findViewById(com.tencent.mm.i.anT));
    this.jAg = ((TextView)paramView.findViewById(com.tencent.mm.i.anH));
    this.jiT = true;
    DP();
    super.onBindView(paramView);
  }

  public final void onDetach()
  {
    if (this.jEc != null);
    af.sh().e(this);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.HelperHeaderPreference
 * JD-Core Version:    0.6.2
 */