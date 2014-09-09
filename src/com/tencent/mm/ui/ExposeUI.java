package com.tencent.mm.ui;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.mm.am.a;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.v;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.sdk.platformtools.y;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceCategory;
import com.tencent.mm.ui.base.preference.PreferenceTitleCategory;
import com.tencent.mm.ui.base.preference.o;

public class ExposeUI extends MMPreference
  implements View.OnClickListener, m
{
  private long cDM;
  private int dAk = -1;
  private Dialog dXD = null;
  private o dXi;
  private int eZN;
  private v iIQ;
  private int iIR;
  private String iIS;
  private String iIT = "";
  private Boolean iIU = Boolean.valueOf(false);
  private boolean iIV = false;
  private boolean iIW = false;
  private String username = "";

  private String aOV()
  {
    switch (this.eZN)
    {
    case 36:
    default:
      return "";
    case 34:
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = this.iIS;
      arrayOfObject2[1] = Integer.valueOf(this.iIR);
      return String.format("<exposecontent><weburl>%s</weburl><webscence>%d</webscence></exposecontent>", arrayOfObject2);
    case 37:
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = this.iIT;
      return String.format("<exposecontent><bottleid>%s</bottleid></exposecontent>", arrayOfObject1);
    case 35:
      return String.format("", new Object[] { "" });
    case 38:
      return String.format("", new Object[] { "" });
    case 33:
    }
    return String.format("", new Object[] { "" });
  }

  private void afq()
  {
    if (this.iIV)
    {
      Intent localIntent = new Intent(aPI(), LauncherUI.class);
      localIntent.addFlags(67108864);
      startActivity(localIntent);
      return;
    }
    finish();
  }

  private void refresh()
  {
    this.dXi.removeAll();
    PreferenceTitleCategory localPreferenceTitleCategory = new PreferenceTitleCategory(this);
    localPreferenceTitleCategory.setTitle(n.bBu);
    this.dXi.a(localPreferenceTitleCategory);
    Preference localPreference1 = new Preference(this);
    localPreference1.setTitle(n.cad);
    localPreference1.setKey("MM_EXPOSE_TYPE_SEX");
    localPreference1.setLayoutResource(k.biA);
    Preference localPreference2;
    label133: Preference localPreference3;
    label193: Preference localPreference4;
    label254: Preference localPreference5;
    if (this.dAk == 1)
    {
      localPreference1.setWidgetLayoutResource(k.bjx);
      this.dXi.a(localPreference1);
      localPreference2 = new Preference(this);
      localPreference2.setTitle(n.caa);
      localPreference2.setKey("MM_EXPOSE_TYPE_CHEAT");
      localPreference2.setLayoutResource(k.biA);
      if (this.dAk != 2)
        break label443;
      localPreference2.setWidgetLayoutResource(k.bjx);
      this.dXi.a(localPreference2);
      localPreference3 = new Preference(this);
      localPreference3.setTitle(n.cae);
      localPreference3.setKey("MM_EXPOSE_TYPE_RUBBISH");
      localPreference3.setLayoutResource(k.biA);
      if (this.dAk != 3)
        break label453;
      localPreference3.setWidgetLayoutResource(k.bjx);
      this.dXi.a(localPreference3);
      localPreference4 = new Preference(this);
      localPreference4.setTitle(n.cab);
      localPreference4.setKey("MM_EXPOSE_TYPE_INFRINGEMENT");
      localPreference4.setLayoutResource(k.biA);
      if (this.dAk != 4)
        break label464;
      localPreference4.setWidgetLayoutResource(k.bjx);
      this.dXi.a(localPreference4);
      localPreference5 = new Preference(this);
      localPreference5.setTitle(n.cac);
      localPreference5.setKey("MM_EXPOSE_TYPE_OTHER");
      localPreference5.setLayoutResource(k.biA);
      if (this.dAk != 999)
        break label475;
      localPreference5.setWidgetLayoutResource(k.bjx);
    }
    while (true)
    {
      this.dXi.a(localPreference5);
      PreferenceCategory localPreferenceCategory = new PreferenceCategory(this);
      this.dXi.a(localPreferenceCategory);
      this.dXi.notifyDataSetChanged();
      ViewGroup localViewGroup = (ViewGroup)aPH();
      int i = 0;
      int j = localViewGroup.getChildCount();
      while (i < j)
      {
        View localView = localViewGroup.getChildAt(i);
        if ((localView instanceof TextView))
          com.tencent.mm.sdk.platformtools.z.d("!44@8z3JI34/JHQrD9jDKhB28lG3409F0KW6Kc2x+ZqbXQQ=", "id=" + localView.getId());
        i++;
      }
      localPreference1.setWidgetLayoutResource(k.bjy);
      break;
      label443: localPreference2.setWidgetLayoutResource(k.bjy);
      break label133;
      label453: localPreference3.setWidgetLayoutResource(k.bjy);
      break label193;
      label464: localPreference4.setWidgetLayoutResource(k.bjy);
      break label254;
      label475: localPreference5.setWidgetLayoutResource(k.bjy);
    }
  }

  protected final void DP()
  {
    this.dXi = aTL();
    oP(n.bxy);
    a(new z(this));
    a(0, getString(n.bxA), new aa(this), cu.iMA);
    ((TextView)findViewById(i.ash)).setOnClickListener(this);
    refresh();
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
      this.iIW = true;
      oN(k.beI);
      oP(n.bxx);
      a(0, getString(n.bxt), new ab(this));
      return;
    }
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(paramInt1);
    arrayOfObject[1] = Integer.valueOf(paramInt2);
    com.tencent.mm.sdk.platformtools.z.e("!44@8z3JI34/JHQrD9jDKhB28lG3409F0KW6Kc2x+ZqbXQQ=", "error update expose: errType:%d, errCode:%d", arrayOfObject);
  }

  public final boolean a(o paramo, Preference paramPreference)
  {
    String str = paramPreference.getKey();
    if (str.equals("MM_EXPOSE_TYPE_OTHER"))
      this.dAk = 999;
    while (true)
    {
      refresh();
      return false;
      if (str.equals("MM_EXPOSE_TYPE_SEX"))
        this.dAk = 1;
      else if (str.equals("MM_EXPOSE_TYPE_CHEAT"))
        this.dAk = 2;
      else if (str.equals("MM_EXPOSE_TYPE_RUBBISH"))
        this.dAk = 3;
      else if (str.equals("MM_EXPOSE_TYPE_INFRINGEMENT"))
        this.dAk = 4;
    }
  }

  protected final int getLayoutId()
  {
    return k.beH;
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
      a.b(aPI(), "webview", ".ui.tools.WebViewUI", localIntent);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.iIW = false;
    this.username = getIntent().getStringExtra("k_username");
    this.iIT = getIntent().getStringExtra("k_bottle_id");
    this.eZN = getIntent().getIntExtra("k_expose_scene", 0);
    this.iIR = getIntent().getIntExtra("k_expose_web_scene", 0);
    this.iIS = getIntent().getStringExtra("k_expose_url");
    this.cDM = getIntent().getLongExtra("k_expose_msg_id", 0L);
    this.iIV = getIntent().getBooleanExtra("k_jump_to_launcher", false);
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this.username;
    arrayOfObject[1] = Integer.valueOf(this.eZN);
    arrayOfObject[2] = Long.valueOf(this.cDM);
    com.tencent.mm.sdk.platformtools.z.i("!44@8z3JI34/JHQrD9jDKhB28lG3409F0KW6Kc2x+ZqbXQQ=", "usename- %s,reportScene-%d,msgId-%d", arrayOfObject);
    DP();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      afq();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  protected void onPause()
  {
    bg.qX().b(166, this);
    super.onPause();
  }

  protected void onResume()
  {
    super.onResume();
    bg.qX().a(166, this);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.ExposeUI
 * JD-Core Version:    0.6.2
 */