package com.tencent.mm.ui.setting;

import android.app.ProgressDialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.InputFilter;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.m.a;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.ad;
import com.tencent.mm.modelsimple.s;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.dy;

public class SettingsModifyEmailAddrUI extends MMActivity
  implements m
{
  private ProgressDialog dWT;
  private EditText jNp;
  private String jNq;
  private String jNr;
  private TextView jNs;
  private TextView jNt;
  private String jjX = null;

  private void aZr()
  {
    this.jNs.setVisibility(8);
    this.jNs.setText(getString(n.chq));
    this.jNt.setText(getString(n.cfV));
    this.jNt.setTextColor(getResources().getColor(com.tencent.mm.f.NP));
    this.jNp.setEnabled(true);
    EditText localEditText = this.jNp;
    InputFilter[] arrayOfInputFilter = new InputFilter[1];
    arrayOfInputFilter[0] = new do(this);
    localEditText.setFilters(arrayOfInputFilter);
    String str = com.tencent.mm.modelsimple.f.N(this);
    if (!ap.jb(str))
      this.jNp.setText(str);
    a(0, getString(n.bud), new dp(this));
  }

  protected final void DP()
  {
    oP(n.bmV);
    this.jNp = ((EditText)findViewById(i.aPk));
    this.jNs = ((TextView)findViewById(i.aTS));
    this.jNt = ((TextView)findViewById(i.aEU));
    this.jNq = ((String)bg.qW().oQ().get(5));
    this.jNp.setText(this.jNq);
    Integer localInteger = (Integer)bg.qW().oQ().get(7);
    if ((localInteger != null) && ((0x2 & localInteger.intValue()) != 0));
    for (boolean bool = true; ; bool = false)
    {
      Boolean localBoolean = Boolean.valueOf(bool);
      a(new cs(this));
      if (!localBoolean.booleanValue())
        break;
      this.jNs.setVisibility(0);
      this.jNs.setText(getString(n.chq));
      this.jNt.setText(getString(n.cfV));
      this.jNt.setTextColor(getResources().getColor(com.tencent.mm.f.NP));
      this.jNp.setEnabled(false);
      EditText localEditText2 = this.jNp;
      InputFilter[] arrayOfInputFilter2 = new InputFilter[1];
      arrayOfInputFilter2[0] = new dd(this);
      localEditText2.setFilters(arrayOfInputFilter2);
      this.jNs.setOnClickListener(new di(this));
      ak(this.jNp);
      return;
    }
    if (!ap.jb(this.jNq))
    {
      this.jNs.setVisibility(0);
      this.jNs.setText(getString(n.ceC));
      this.jNt.setText(getString(n.ceB));
      this.jNt.setTextColor(getResources().getColor(com.tencent.mm.f.OG));
      this.jNp.setEnabled(false);
      EditText localEditText1 = this.jNp;
      InputFilter[] arrayOfInputFilter1 = new InputFilter[1];
      arrayOfInputFilter1[0] = new dk(this);
      localEditText1.setFilters(arrayOfInputFilter1);
      this.jNs.setOnClickListener(new dl(this));
      a(0, getString(n.bta), new dn(this));
      ak(this.jNp);
      return;
    }
    aZr();
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    z.i("!56@9DU/RFsdGl9EDFTBLJS80xINtGTHM2VfnL9NgIOnlmafWtu+3eVDmg==", "onSceneEnd: sceneType = " + paramx.getType() + " errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (dy.a(aPI(), paramInt1, paramInt2, paramString, 4));
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              return;
              if (paramx.getType() != 254)
                break;
              if ((paramInt1 == 0) && (paramInt2 == 0))
              {
                this.jjX = ((s)paramx).zi();
                ad localad = new ad(2);
                bg.qX().d(localad);
                return;
              }
              if (this.dWT != null)
              {
                this.dWT.dismiss();
                this.dWT = null;
              }
              if (paramInt2 == -82)
              {
                com.tencent.mm.ui.base.e.a(this, n.ceS, n.buo, new dr(this));
                return;
              }
              if (paramInt2 == -83)
              {
                com.tencent.mm.ui.base.e.a(this, n.ceP, n.buo, new ct(this));
                return;
              }
              if (paramInt2 == -84)
              {
                com.tencent.mm.ui.base.e.a(this, n.ceQ, n.buo, new cu(this));
                return;
              }
            }
            while (paramInt2 != -85);
            com.tencent.mm.ui.base.e.a(this, n.ceJ, n.buo, new cv(this));
            return;
            if (paramx.getType() != 256)
              break;
            com.tencent.mm.ab.k localk = new com.tencent.mm.ab.k(5);
            bg.qX().d(localk);
            if (((a)paramx).sg() == a.dmJ)
            {
              if ((paramInt1 == 0) && (paramInt2 == 0))
              {
                com.tencent.mm.ui.base.e.a(aPI(), n.cfq, n.buo, new cw(this));
                return;
              }
              if (this.dWT != null)
              {
                this.dWT.dismiss();
                this.dWT = null;
              }
              if (paramInt2 == -82)
              {
                com.tencent.mm.ui.base.e.a(this, n.ceS, n.buo, new cx(this));
                return;
              }
              if (paramInt2 == -83)
              {
                com.tencent.mm.ui.base.e.a(this, n.ceP, n.buo, new cy(this));
                return;
              }
              if (paramInt2 == -84)
              {
                com.tencent.mm.ui.base.e.a(this, n.ceQ, n.buo, new cz(this));
                return;
              }
              if (paramInt2 == -85)
              {
                com.tencent.mm.ui.base.e.a(this, n.ceJ, n.buo, new da(this));
                return;
              }
              if (paramInt2 == -86)
              {
                com.tencent.mm.ui.base.e.a(this, n.ceU, n.buo, new db(this));
                return;
              }
              ActionBarActivity localActionBarActivity1 = aPI();
              int i = n.cfp;
              Object[] arrayOfObject1 = new Object[2];
              arrayOfObject1[0] = Integer.valueOf(paramInt1);
              arrayOfObject1[1] = Integer.valueOf(paramInt2);
              com.tencent.mm.ui.base.e.a(localActionBarActivity1, getString(i, arrayOfObject1), getString(n.buo), new dc(this));
              return;
            }
          }
          while (((a)paramx).sg() != a.dmK);
          if (this.dWT != null)
          {
            this.dWT.dismiss();
            this.dWT = null;
          }
        }
        while ((paramInt1 != 0) || (paramInt2 != 0));
        if ((this.jjX != null) && (this.jjX.length() > 0))
          bg.qW().oQ().set(3, this.jjX);
        com.tencent.mm.ui.base.e.a(aPI(), n.ceL, n.buo, new de(this));
        Integer localInteger = Integer.valueOf(0x2 | ((Integer)bg.qW().oQ().get(7)).intValue());
        bg.qW().oQ().set(7, localInteger);
        return;
      }
      while (paramx.getType() == 38);
      if (paramx.getType() == 108)
      {
        if (this.dWT != null)
        {
          this.dWT.dismiss();
          this.dWT = null;
        }
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          com.tencent.mm.ui.base.e.a(aPI(), n.cfq, n.buo, new df(this));
          return;
        }
        ActionBarActivity localActionBarActivity2 = aPI();
        int j = n.cfp;
        Object[] arrayOfObject2 = new Object[2];
        arrayOfObject2[0] = Integer.valueOf(paramInt1);
        arrayOfObject2[1] = Integer.valueOf(paramInt2);
        com.tencent.mm.ui.base.e.a(localActionBarActivity2, getString(j, arrayOfObject2), getString(n.buo), new dg(this));
        return;
      }
    }
    while (paramx.getType() != 255);
    if (paramInt2 == 0)
    {
      a locala = new a(a.dmK, this.jNp.getText().toString().trim());
      bg.qX().d(locala);
      return;
    }
    if (this.dWT != null)
    {
      this.dWT.dismiss();
      this.dWT = null;
    }
    com.tencent.mm.ui.base.e.a(this, n.ceK, n.buo, new dh(this));
  }

  protected final int getLayoutId()
  {
    return com.tencent.mm.k.bmV;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    DP();
    bg.qX().a(38, this);
    bg.qX().a(254, this);
    bg.qX().a(256, this);
    bg.qX().a(108, this);
    bg.qX().a(255, this);
  }

  public void onDestroy()
  {
    bg.qX().b(38, this);
    bg.qX().b(254, this);
    bg.qX().b(256, this);
    bg.qX().b(108, this);
    bg.qX().b(255, this);
    super.onDestroy();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.SettingsModifyEmailAddrUI
 * JD-Core Version:    0.6.2
 */