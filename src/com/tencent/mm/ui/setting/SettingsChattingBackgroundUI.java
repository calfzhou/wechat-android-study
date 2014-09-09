package com.tencent.mm.ui.setting;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.tencent.mm.ad.a;
import com.tencent.mm.ad.m;
import com.tencent.mm.ad.s;
import com.tencent.mm.compatible.g.h;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.pluginsdk.ui.tools.bc;
import com.tencent.mm.q;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.o;
import com.tencent.mm.ui.tools.CropImageNewUI;
import com.tencent.mm.ui.tools.l;

public class SettingsChattingBackgroundUI extends MMPreference
{
  private o dXi;
  private boolean jNg;
  private String username;

  private String fW(boolean paramBoolean)
  {
    m localm = s.yO();
    if (this.jNg)
      return localm.i("default", paramBoolean);
    return localm.i(this.username, paramBoolean);
  }

  protected final void DP()
  {
    oP(n.cfm);
    this.dXi = aTL();
    this.jNg = getIntent().getBooleanExtra("isApplyToAll", true);
    if (!this.jNg)
    {
      Preference localPreference = this.dXi.BU("settings_chatting_bg_apply_to_all");
      if (localPreference != null)
        this.dXi.b(localPreference);
    }
    this.username = getIntent().getStringExtra("username");
    a(new ce(this));
  }

  public final int DZ()
  {
    return q.czR;
  }

  public final boolean a(o paramo, Preference paramPreference)
  {
    String str = paramPreference.getKey();
    z.i("!56@/B4Tb64lLpJkrm2DE1IrT0rq7ozlS8hfONbz10DvOh2mgTWzuQhSVg==", str + " item has been clicked!");
    if (str.equals("settings_chatting_bg_select_bg"))
    {
      Intent localIntent = new Intent();
      localIntent.setClass(this, SettingsSelectBgUI.class);
      localIntent.putExtra("isApplyToAll", this.jNg);
      localIntent.putExtra("username", this.username);
      startActivityForResult(localIntent, 3);
    }
    do
    {
      return true;
      if (str.equals("settings_chatting_bg_select_from_album"))
      {
        bc.a(this, 1, null);
        return true;
      }
      if (!str.equals("settings_chatting_bg_take_photo"))
        break;
    }
    while (bc.c(this, h.dOL, "microMsg." + System.currentTimeMillis() + ".jpg", 2));
    Toast.makeText(this, getString(n.cdH), 1).show();
    return true;
    if (str.equals("settings_chatting_bg_apply_to_all"))
    {
      com.tencent.mm.ui.base.e.a(aPI(), getString(n.cfn), "", new cf(this), null);
      return true;
    }
    return false;
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    switch (paramInt1)
    {
    default:
    case 1:
    case 2:
    case 4:
    case 3:
    }
    do
      while (true)
      {
        if (!this.jNg)
        {
          setResult(-1);
          finish();
        }
        String str;
        do
        {
          do
            return;
          while (paramIntent == null);
          Intent localIntent2 = new Intent(this, CropImageNewUI.class);
          localIntent2.putExtra("CropImageMode", 2);
          localIntent2.putExtra("CropImage_bg_vertical", fW(true));
          localIntent2.putExtra("CropImage_bg_horizontal", fW(false));
          l.b(this, paramIntent, localIntent2, bg.qW().pa(), 4);
          return;
          str = bc.a(getApplicationContext(), paramIntent, bg.qW().pa());
        }
        while (str == null);
        Intent localIntent1 = new Intent(this, CropImageNewUI.class);
        localIntent1.putExtra("CropImageMode", 2);
        localIntent1.putExtra("CropImage_ImgPath", str);
        localIntent1.putExtra("CropImage_bg_vertical", fW(true));
        localIntent1.putExtra("CropImage_bg_horizontal", fW(false));
        startActivityForResult(localIntent1, 4);
        return;
        if (paramInt2 == -1)
        {
          bg.qW().oQ().set(66820, Integer.valueOf(-1));
          if (this.jNg)
          {
            bg.qW().oQ().set(12311, Integer.valueOf(-1));
            s.yO().eb(1);
          }
          else
          {
            com.tencent.mm.ad.b localb = s.yP();
            a locala1 = localb.ha(this.username);
            if (locala1 == null)
            {
              a locala2 = new a();
              locala2.setUsername(this.username);
              locala2.dZ(-1);
              localb.a(locala2);
            }
            else
            {
              locala1.dZ(-1);
              localb.b(locala1);
            }
          }
        }
      }
    while (paramInt2 == -1);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    DP();
  }

  protected void onDestroy()
  {
    super.onDestroy();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.SettingsChattingBackgroundUI
 * JD-Core Version:    0.6.2
 */