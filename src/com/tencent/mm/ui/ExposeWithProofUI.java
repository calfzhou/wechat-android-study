package com.tencent.mm.ui;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.protocal.a.ha;
import com.tencent.mm.protocal.a.hb;
import com.tencent.mm.protocal.a.he;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.y;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.e;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceTitleCategory;
import com.tencent.mm.ui.base.preference.o;
import com.tencent.mm.ui.chatting.ChattingUI;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ExposeWithProofUI extends MMPreference
  implements View.OnClickListener, m
{
  private long cDM = -1L;
  private Dialog dXD = null;
  private o dXi;
  private int iIR = 0;
  private String iIS = null;
  private Boolean iIU = Boolean.valueOf(false);
  private com.tencent.mm.t.a iIY = null;
  private int iIZ = 0;
  private String iJa = "";
  private long[] iJb = null;
  private boolean iJc = false;
  private List iJd = null;
  private int iJe = 0;

  private void aOW()
  {
    Preference localPreference = this.dXi.BU("KEY_MM_EXPOSEWITHPROOFTYPE_EXAMPLE");
    if ((this.iJb != null) && (this.iJb.length > 0))
    {
      String str = getString(n.bGn);
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(this.iJb.length);
      localPreference.setSummary(String.format(str, arrayOfObject));
    }
    while (true)
    {
      this.dXi.notifyDataSetChanged();
      return;
      localPreference.setSummary(n.bGo);
    }
  }

  protected final void DP()
  {
    int i = 0;
    this.dXi = aTL();
    Object localObject = bg.qW().oQ().get(327760);
    ha localha = new ha();
    byte[] arrayOfByte;
    if ((!ch.ys()) && (localObject != null))
      arrayOfByte = ch.jg(localObject.toString());
    try
    {
      localha.bn(arrayOfByte);
      LinkedList localLinkedList = localha.dxT;
      if (localLinkedList != null)
      {
        Iterator localIterator2 = localLinkedList.iterator();
        while (localIterator2.hasNext())
        {
          he localhe = (he)localIterator2.next();
          if (localhe.id == this.iJe)
            this.iJd = localhe.hWR;
        }
      }
      Object[] arrayOfObject3 = new Object[3];
      arrayOfObject3[0] = Integer.valueOf(localha.dxT.size());
      arrayOfObject3[1] = Integer.valueOf(this.iJe);
      if (this.iJd != null);
      for (int k = this.iJd.size(); ; k = 0)
      {
        arrayOfObject3[2] = Integer.valueOf(k);
        z.i("!44@/B4Tb64lLpJ/sz39qr3dExKTa11KfaVGx9wyzYRkZYs=", "[oneliang]parse success,dynamic expose reason,sceneSize:%d,scene:%d,reasonSize:%d", arrayOfObject3);
        if (this.iJd == null)
        {
          Object[] arrayOfObject1 = new Object[1];
          arrayOfObject1[0] = Integer.valueOf(this.iJe);
          z.i("!44@/B4Tb64lLpJ/sz39qr3dExKTa11KfaVGx9wyzYRkZYs=", "[oneliang]hard code expose reason,scene:%d", arrayOfObject1);
          this.iJd = ((List)ah.Dw().get(this.iJe));
        }
        oP(n.bxy);
        a(new ad(this));
        a(0, getString(n.bxA), new ae(this), cu.iMA);
        ((TextView)findViewById(i.ash)).setOnClickListener(this);
        if (this.dXi.BU("KEY_MM_EXPOSEWITHPROOF_TITLE") == null)
        {
          PreferenceTitleCategory localPreferenceTitleCategory = new PreferenceTitleCategory(this);
          localPreferenceTitleCategory.setTitle(n.bBu);
          localPreferenceTitleCategory.setKey("KEY_MM_EXPOSEWITHPROOF_TITLE");
          this.dXi.a(localPreferenceTitleCategory);
        }
        if (this.iJd == null)
          break label548;
        Iterator localIterator1 = this.iJd.iterator();
        while (true)
        {
          if (!localIterator1.hasNext())
            break label548;
          localhb = (hb)localIterator1.next();
          String str1 = "key_" + localhb.id;
          if (this.dXi.BU(str1) == null)
          {
            Preference localPreference2 = new Preference(this);
            if (localhb.value == null)
              break;
            str2 = localhb.value;
            localPreference2.setTitle(str2);
            localPreference2.setKey(str1);
            localPreference2.setLayoutResource(k.biA);
            localPreference2.setWidgetLayoutResource(k.biG);
            this.dXi.a(localPreference2);
          }
        }
      }
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        hb localhb;
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = localIOException.getMessage();
        z.i("!44@/B4Tb64lLpJ/sz39qr3dExKTa11KfaVGx9wyzYRkZYs=", "[oneliang]parse exception:%s", arrayOfObject2);
        continue;
        String str2 = getResources().getString(localhb.resourceId);
      }
      label548: if (this.iJc)
      {
        if (this.dXi.BU("KEY_MM_EXPOSEWITHPROOFTYPE_EXAMPLE") != null)
          break label692;
        Preference localPreference1 = new Preference(this);
        localPreference1.setTitle(n.bGl);
        localPreference1.setKey("KEY_MM_EXPOSEWITHPROOFTYPE_EXAMPLE");
        localPreference1.setLayoutResource(k.biA);
        localPreference1.setSummary(n.bGo);
        this.dXi.a(localPreference1);
      }
      while (true)
      {
        ViewGroup localViewGroup = (ViewGroup)aPH();
        int j = localViewGroup.getChildCount();
        while (i < j)
        {
          View localView = localViewGroup.getChildAt(i);
          if ((localView instanceof TextView))
            z.d("!44@/B4Tb64lLpJ/sz39qr3dExKTa11KfaVGx9wyzYRkZYs=", "id=" + localView.getId());
          i++;
        }
        label692: aOW();
      }
    }
  }

  public final int DZ()
  {
    return -1;
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    if (this.dXD != null)
    {
      this.dXD.dismiss();
      this.dXD = null;
    }
    this.iIU = Boolean.valueOf(false);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      oN(k.beI);
      oP(n.bxx);
      a(0, getString(n.bxt), new af(this));
      return;
    }
    Toast.makeText(aPI(), getString(n.bGm), 0).show();
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(paramInt1);
    arrayOfObject[1] = Integer.valueOf(paramInt2);
    z.e("!44@/B4Tb64lLpJ/sz39qr3dExKTa11KfaVGx9wyzYRkZYs=", "error update expose: errType:%d, errCode:%d", arrayOfObject);
  }

  public final boolean a(o paramo, Preference paramPreference)
  {
    String str = paramPreference.getKey();
    if (str.equals("KEY_MM_EXPOSEWITHPROOFTYPE_EXAMPLE"))
    {
      Intent localIntent = new Intent();
      localIntent.setClass(aPI(), ChattingUI.class);
      localIntent.putExtra("Chat_User", this.iJa);
      localIntent.putExtra("finish_direct", true);
      localIntent.putExtra("expose_edit_mode", true);
      if (this.iJb != null)
        localIntent.putExtra("expose_selected_ids", this.iJb);
      startActivityForResult(localIntent, 1);
    }
    hb localhb;
    do
    {
      Iterator localIterator;
      while (!localIterator.hasNext())
      {
        do
          return false;
        while (this.iJd == null);
        localIterator = this.iJd.iterator();
      }
      localhb = (hb)localIterator.next();
    }
    while (!str.equals("key_" + localhb.id));
    if ((this.iIZ & localhb.id) == localhb.id)
    {
      this.iIZ = ((0xFFFFFFFF ^ localhb.id) & this.iIZ);
      label200: if ((this.iIZ & localhb.id) != localhb.id)
        break label251;
      paramPreference.setWidgetLayoutResource(k.biF);
    }
    while (true)
    {
      paramo.notifyDataSetChanged();
      break;
      this.iIZ |= localhb.id;
      break label200;
      label251: paramPreference.setWidgetLayoutResource(k.biG);
    }
  }

  protected final int getLayoutId()
  {
    return k.beH;
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 == 1)
      switch (paramInt2)
      {
      default:
      case -1:
      }
    do
      return;
    while (paramIntent == null);
    this.iJb = paramIntent.getLongArrayExtra("selected_message_ids");
    aOW();
  }

  public void onClick(View paramView)
  {
    if (paramView.getId() == i.ash)
    {
      Intent localIntent = new Intent();
      String str = getString(n.bxw) + "&lang=%s";
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = y.aGW();
      localIntent.putExtra("rawUrl", String.format(str, arrayOfObject));
      localIntent.putExtra("title", getString(n.bxv));
      com.tencent.mm.am.a.b(aPI(), "webview", ".ui.tools.WebViewUI", localIntent);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.iJa = getIntent().getStringExtra("k_username");
    this.iJc = getIntent().getBooleanExtra("k_from_profile", false);
    this.iJe = getIntent().getIntExtra("k_expose_scene", 0);
    this.cDM = getIntent().getLongExtra("k_expose_msg_id", -1L);
    this.iIS = getIntent().getStringExtra("k_expose_url");
    this.iIR = getIntent().getIntExtra("k_expose_web_scene", 0);
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this.iJa;
    arrayOfObject[1] = Boolean.valueOf(this.iJc);
    arrayOfObject[2] = Integer.valueOf(this.iJe);
    z.i("!44@/B4Tb64lLpJ/sz39qr3dExKTa11KfaVGx9wyzYRkZYs=", "[oneliang]chatName:%s,fromProfile:%s,exposeScene:%d", arrayOfObject);
    DP();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      finish();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  protected void onPause()
  {
    bg.qX().b(661, this);
    super.onPause();
  }

  protected void onResume()
  {
    super.onResume();
    bg.qX().a(661, this);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.ExposeWithProofUI
 * JD-Core Version:    0.6.2
 */