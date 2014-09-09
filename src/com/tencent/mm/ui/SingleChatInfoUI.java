package com.tencent.mm.ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.Looper;
import android.widget.ListView;
import com.tencent.mm.ab.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.pluginsdk.ae;
import com.tencent.mm.pluginsdk.af;
import com.tencent.mm.pluginsdk.g;
import com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference;
import com.tencent.mm.q;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.storage.aw;
import com.tencent.mm.storage.i;
import com.tencent.mm.storage.s;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.chatting.ChattingUI;
import com.tencent.mm.ui.d.a;
import com.tencent.mm.ui.setting.SettingsChattingBackgroundUI;
import com.tencent.mm.ui.tools.ImageGalleryGridUI;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SingleChatInfoUI extends MMPreference
  implements ae
{
  private static boolean ekQ = false;
  private String cEh;
  private com.tencent.mm.ui.base.preference.o dXi;
  private SharedPreferences dkI = null;
  private i elz;
  private ContactListExpandPreference etP;
  private CheckBoxPreference etQ;
  private CheckBoxPreference etS;
  private boolean eua;
  private int eud = -1;
  private com.tencent.mm.pluginsdk.ui.e eue = new com.tencent.mm.pluginsdk.ui.e(new em(this));
  boolean euf = false;
  private String eug = "";
  private cm gQj = new cm(Looper.getMainLooper());

  private void KV()
  {
    if (this.dkI == null)
      this.dkI = getSharedPreferences(getPackageName() + "_preferences", 0);
    this.eua = this.elz.zW();
    if (this.eua)
    {
      oT(0);
      if (this.etQ != null)
        this.dkI.edit().putBoolean("room_notify_new_msg", true).commit();
    }
    while (true)
    {
      this.dXi.notifyDataSetChanged();
      return;
      oT(8);
      if (this.etQ != null)
        this.dkI.edit().putBoolean("room_notify_new_msg", false).commit();
    }
  }

  protected final void DP()
  {
    this.dXi = aTL();
    Bt(getString(com.tencent.mm.n.cbw));
    this.etP = ((ContactListExpandPreference)this.dXi.BU("roominfo_contact_anchor"));
    this.etP.a(this.dXi, this.etP.getKey());
    this.etP.jdMethod_do(true).dp(false);
    if ((this.elz != null) && (this.elz.jm() == 1))
      this.etP.jdMethod_do(false);
    this.etQ = ((CheckBoxPreference)this.dXi.BU("room_notify_new_msg"));
    this.etS = ((CheckBoxPreference)this.dXi.BU("room_placed_to_the_top"));
    if (this.dkI == null)
      this.dkI = getSharedPreferences(getPackageName() + "_preferences", 0);
    if (this.elz != null)
      if (bg.qW().oW().yE(this.elz.getUsername()) == null)
      {
        this.etS.setEnabled(false);
        this.eua = this.elz.zW();
        this.dkI.edit().putBoolean("room_notify_new_msg", this.eua).commit();
      }
    while (true)
    {
      this.eud = bg.qW().oV().zG(this.cEh);
      if (this.eud <= 0)
        this.dXi.BV("room_chatting_images");
      this.dXi.notifyDataSetChanged();
      if (this.etP != null)
      {
        LinkedList localLinkedList = new LinkedList();
        localLinkedList.add(this.cEh);
        this.etP.g(this.cEh, localLinkedList);
        getListView().setOnScrollListener(this.eue);
        this.etP.a(this.eue);
        this.etP.a(new eo(this));
      }
      a(new ep(this));
      return;
      this.dkI.edit().putBoolean("room_placed_to_the_top", bg.qW().oW().yK(this.elz.getUsername())).commit();
      break;
      this.dkI.edit().putBoolean("room_notify_new_msg", false).commit();
      this.eua = false;
    }
  }

  public final int DZ()
  {
    return q.czM;
  }

  public final com.tencent.mm.ui.base.preference.y a(SharedPreferences paramSharedPreferences)
  {
    return new com.tencent.mm.ui.base.preference.b(this, paramSharedPreferences);
  }

  public final boolean a(com.tencent.mm.ui.base.preference.o paramo, Preference paramPreference)
  {
    int i = 1;
    String str1 = paramPreference.getKey();
    if (str1.equals("room_notify_new_msg"))
      if (!this.eua)
      {
        this.eua = i;
        if (!this.eua)
          break label151;
        com.tencent.mm.model.y.i(this.elz);
        label44: this.elz = bg.qW().oT().ys(this.cEh);
        bg.qX().d(new k(5));
        if (this.dkI == null)
          this.dkI = getSharedPreferences(getPackageName() + "_preferences", 0);
        this.dkI.edit().putBoolean("room_notify_new_msg", this.eua).commit();
        KV();
      }
    label151: label288: 
    do
    {
      SharedPreferences localSharedPreferences;
      do
      {
        return false;
        i = 0;
        break;
        com.tencent.mm.model.y.j(this.elz);
        break label44;
        if (!str1.equals("room_placed_to_the_top"))
          break label288;
        localSharedPreferences = getSharedPreferences(this.eug, 0);
      }
      while (this.elz == null);
      if (bg.qW().oW().yK(this.elz.getUsername()))
        com.tencent.mm.model.y.e(this.elz.getUsername(), i);
      while (true)
      {
        localSharedPreferences.edit().putBoolean("room_placed_to_the_top", bg.qW().oW().yK(this.elz.getUsername())).commit();
        bg.qX().d(new k(5));
        return false;
        com.tencent.mm.model.y.d(this.elz.getUsername(), i);
      }
      if (str1.equals("room_chatting_images"))
      {
        com.tencent.mm.plugin.f.c.n localn = com.tencent.mm.plugin.f.c.n.fTF;
        Object[] arrayOfObject2 = new Object[i];
        arrayOfObject2[0] = Integer.valueOf(i);
        localn.d(11041, arrayOfObject2);
        Intent localIntent4 = new Intent();
        localIntent4.setClass(aPI(), ImageGalleryGridUI.class);
        localIntent4.addFlags(67108864);
        localIntent4.putExtra("kintent_intent_source", i);
        localIntent4.putExtra("kintent_talker", this.cEh);
        localIntent4.putIntegerArrayListExtra("kintent_downloaded_index_list", new ArrayList());
        localIntent4.putExtra("kintent_image_count", this.eud);
        localIntent4.putExtra("kintent_image_index", -1 + this.eud);
        startActivity(localIntent4);
        return false;
      }
      if (str1.equals("room_set_chatting_background"))
      {
        Intent localIntent1 = new Intent();
        localIntent1.setClass(this, SettingsChattingBackgroundUI.class);
        localIntent1.putExtra("isApplyToAll", false);
        localIntent1.putExtra("username", this.elz.getUsername());
        startActivityForResult(localIntent1, 2);
        return false;
      }
      if (str1.equals("room_search_chatting_content"))
      {
        Intent localIntent2 = new Intent(this, ChattingUI.class);
        localIntent2.putExtra("Chat_User", this.cEh);
        localIntent2.putExtra("search_chat_content", i);
        localIntent2.putExtra("finish_direct", i);
        startActivity(localIntent2);
        return false;
      }
      if (str1.equals("room_clear_chatting_history"))
      {
        int j = com.tencent.mm.n.bKg;
        Object[] arrayOfObject1 = new Object[i];
        arrayOfObject1[0] = this.elz.od();
        String str2 = getString(j, arrayOfObject1);
        com.tencent.mm.ui.base.e.a(aPI(), i, str2, "", getString(com.tencent.mm.n.bsM), getString(com.tencent.mm.n.bsK), new er(this), null);
        return false;
      }
    }
    while (!str1.equals("room_expose"));
    Intent localIntent3 = new Intent();
    localIntent3.setClass(aPI(), ExposeWithProofUI.class);
    localIntent3.putExtra("k_username", this.cEh);
    localIntent3.putExtra("k_expose_scene", 39);
    localIntent3.putExtra("k_from_profile", i);
    startActivity(localIntent3);
    return false;
  }

  public final void k(String paramString1, String paramString2, String paramString3)
  {
    if ((paramString1.equals(this.cEh)) && (this.etP != null))
      this.etP.notifyChanged();
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt2 != -1);
    do
    {
      return;
      switch (paramInt1)
      {
      default:
        return;
      case 2:
      }
    }
    while (paramInt2 != -1);
    finish();
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (g.axT() != null)
      g.axT().a(this);
    this.cEh = getIntent().getStringExtra("Single_Chat_Talker");
    this.elz = bg.qW().oT().ys(this.cEh);
    this.eug = (getPackageName() + "_preferences");
    DP();
  }

  public void onDestroy()
  {
    if (this.etP != null);
    a.dismiss();
    if (g.axT() != null)
      g.axT().b(this);
    super.onDestroy();
  }

  public void onPause()
  {
    super.onPause();
  }

  public void onResume()
  {
    KV();
    if (this.etP != null)
    {
      LinkedList localLinkedList = new LinkedList();
      localLinkedList.add(this.cEh);
      this.etP.g(this.cEh, localLinkedList);
    }
    this.dXi.notifyDataSetChanged();
    super.onResume();
    if (!this.euf)
    {
      String str = getIntent().getStringExtra("need_matte_high_light_item");
      if (!ap.jb(str))
      {
        int i = this.dXi.BW(str);
        setSelection(i - 3);
        new cm().postDelayed(new en(this, i), 10L);
      }
      this.euf = true;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.SingleChatInfoUI
 * JD-Core Version:    0.6.2
 */