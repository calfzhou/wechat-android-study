package com.tencent.mm.pluginsdk.ui.simley;

import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.pluginsdk.ui.bb;
import com.tencent.mm.pluginsdk.ui.h;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ab;
import com.tencent.mm.ui.base.MMRadioImageButton;

public abstract class g
{
  private final String TAG = "!44@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0NtH/Ot6JUKs=";
  private String ezB;
  private i hIA;
  private int hIB;
  private int hIC;
  protected n hID;
  private int hIE;
  private boolean hIF = true;
  private int hIy;
  private int hIz;

  public g(String paramString, int paramInt, i parami, n paramn, boolean paramBoolean)
  {
    if (ch.jb(paramString))
    {
      z.i("!44@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0NtH/Ot6JUKs=", "catch invalid Smiley Tab want add??!!");
      this.hIF = false;
    }
    do
    {
      return;
      this.ezB = paramString;
      this.hIA = parami;
      this.hID = paramn;
      this.hIz = paramInt;
    }
    while (!paramBoolean);
    i locali = this.hIA;
    String str = this.ezB;
    int j;
    int k;
    label105: int i;
    if (str.equals("TAG_DEFAULT_TAB"))
      if (locali.aDS())
      {
        j = 0;
        if (!locali.aDT())
          break label209;
        k = 0;
        i = j + k;
      }
    while (true)
    {
      this.hIy = i;
      this.hIB = this.hIA.vU(this.ezB);
      this.hIC = this.hIA.vV(this.ezB);
      this.hIE = this.hIA.ae(this.ezB, this.hIB);
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = this.ezB;
      arrayOfObject[1] = Integer.valueOf(paramInt);
      z.i("!44@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0NtH/Ot6JUKs=", "smiley panel tab: productId: %s, startIndex: %d", arrayOfObject);
      return;
      j = locali.aDQ();
      break;
      label209: k = locali.aDR();
      break label105;
      if (str.equals(String.valueOf(ab.iiI)))
      {
        if (bg.qW().isSDCardAvailable())
          i = com.tencent.mm.pluginsdk.g.axR().KG();
        else
          i = 0;
      }
      else if (bg.qW().isSDCardAvailable())
        i = com.tencent.mm.pluginsdk.g.axR().kJ(str);
      else
        i = 0;
    }
  }

  public final String JS()
  {
    return this.ezB;
  }

  public final l a(n paramn, i parami)
  {
    this.hID = paramn;
    this.hIA = parami;
    z.d("!44@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0NtH/Ot6JUKs=", "refresh cache");
    return null;
  }

  public final h aDA()
  {
    return this.hID.aEG();
  }

  public final int aDB()
  {
    return this.hIE;
  }

  public final MMRadioImageButton aDC()
  {
    if (this.hID == null)
      return null;
    return this.hID.vY(this.ezB);
  }

  public final void aDD()
  {
    this.hIA = null;
    this.hID = null;
  }

  public final i aDr()
  {
    return this.hIA;
  }

  public final int aDs()
  {
    return this.hIy;
  }

  public final int aDt()
  {
    return this.hIz;
  }

  public final boolean aDu()
  {
    return "TAG_DEFAULT_TAB".equals(this.ezB);
  }

  public final int aDv()
  {
    return this.hIB * this.hIC;
  }

  public final int aDw()
  {
    if (aDv() <= 0)
      return 0;
    return (int)Math.ceil(this.hIy / aDv());
  }

  public final int aDx()
  {
    return this.hIC;
  }

  public final bb aDy()
  {
    return this.hID.aDy();
  }

  public final SmileyPanelVP aDz()
  {
    return this.hID.aEH();
  }

  public final l b(n paramn, i parami)
  {
    z.d("!44@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0NtH/Ot6JUKs=", "deep refresh cache");
    a(paramn, parami);
    this.hIz = 0;
    this.hIB = this.hIA.vU(this.ezB);
    this.hIC = this.hIA.vV(this.ezB);
    this.hIE = this.hIA.ae(this.ezB, this.hIB);
    return null;
  }

  public final int getType()
  {
    String str = this.ezB;
    if (str.equals("TAG_DEFAULT_TAB"))
      return 20;
    if (str.equals(String.valueOf(ab.iiI)))
      return 25;
    return 23;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.simley.g
 * JD-Core Version:    0.6.2
 */