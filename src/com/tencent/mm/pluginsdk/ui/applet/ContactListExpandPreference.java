package com.tencent.mm.pluginsdk.ui.applet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.mm.k;
import com.tencent.mm.pluginsdk.ui.e;
import com.tencent.mm.storage.i;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.o;
import java.util.ArrayList;
import java.util.List;

public class ContactListExpandPreference extends Preference
{
  private int hBO = -1;
  public ab hBP;
  public ak hBQ;

  public ContactListExpandPreference(Context paramContext)
  {
    super(paramContext);
    aAP();
    setLayoutResource(k.biJ);
  }

  public ContactListExpandPreference(Context paramContext, int paramInt)
  {
    super(paramContext);
    if (paramInt == 0)
      aAP();
    while (true)
    {
      setLayoutResource(k.biJ);
      return;
      if (paramInt == 1)
      {
        this.hBO = 1;
        this.hBQ = new ak();
      }
    }
  }

  public ContactListExpandPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    aAP();
    setLayoutResource(k.biJ);
  }

  public ContactListExpandPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    aAP();
    setLayoutResource(k.biJ);
  }

  private void aAP()
  {
    this.hBO = 0;
    this.hBP = new ab(getContext());
  }

  public final void C(ArrayList paramArrayList)
  {
    if (this.hBP != null)
      this.hBP.C(paramArrayList);
  }

  public final void T(List paramList)
  {
    if (this.hBP != null)
      this.hBP.hBe.T(paramList);
  }

  public final void a(aj paramaj)
  {
    if (this.hBP != null)
      this.hBP.a(paramaj);
  }

  public final void a(ap paramap)
  {
    if (this.hBP != null)
      this.hBP.a(paramap);
  }

  public final void a(e parame)
  {
    if (this.hBP != null)
      this.hBP.hBe.a(parame);
  }

  public final void a(o paramo, String paramString)
  {
    if (this.hBP != null)
      this.hBP.a(paramo, paramString);
  }

  public final void aAN()
  {
    if (this.hBP != null)
      this.hBP.hBe.aAN();
  }

  public final void aAQ()
  {
    if (this.hBP != null)
      this.hBP.hBe.dm(false);
  }

  public final void aAR()
  {
    if (this.hBP != null)
      this.hBP.hBe.dl(true);
  }

  public final void aAS()
  {
    if (this.hBP != null)
      this.hBP.dk(false);
  }

  public final void aAT()
  {
    notifyChanged();
  }

  public final ContactListExpandPreference jdMethod_do(boolean paramBoolean)
  {
    if (this.hBP != null)
      this.hBP.hBe.hBv = paramBoolean;
    return this;
  }

  public final ContactListExpandPreference dp(boolean paramBoolean)
  {
    if (this.hBP != null)
      this.hBP.hBe.hBu = paramBoolean;
    return this;
  }

  public final void g(String paramString, List paramList)
  {
    if (this.hBP != null)
      this.hBP.g(paramString, paramList);
  }

  public final boolean mD(int paramInt)
  {
    if (this.hBP != null)
      return this.hBP.hBe.mD(paramInt);
    return false;
  }

  public final String mF(int paramInt)
  {
    if ((this.hBP != null) && (this.hBP.hBe.mD(paramInt)))
      return ((i)this.hBP.hBe.getItem(paramInt)).getUsername();
    return "";
  }

  public final String mG(int paramInt)
  {
    if ((this.hBP != null) && (this.hBP.hBe.mD(paramInt)))
      return ((i)this.hBP.hBe.getItem(paramInt)).iV();
    return "";
  }

  public final String mH(int paramInt)
  {
    if ((this.hBP != null) && (this.hBP.hBe.mD(paramInt)))
      return ((i)this.hBP.hBe.getItem(paramInt)).ja();
    return "";
  }

  public final void notifyChanged()
  {
    if (this.hBP != null)
      this.hBP.adD();
  }

  public final void onBindView(View paramView)
  {
    if (this.hBO == 1)
      this.hBQ.onBindView(paramView);
    super.onBindView(paramView);
  }

  public final void vz(String paramString)
  {
    if (this.hBP != null)
      this.hBP.hBe.vz(paramString);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference
 * JD-Core Version:    0.6.2
 */