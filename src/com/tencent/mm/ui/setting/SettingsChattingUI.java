package com.tencent.mm.ui.setting;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.am.a;
import com.tencent.mm.h;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.q;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.aa;
import com.tencent.mm.ui.base.ad;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.o;

public class SettingsChattingUI extends MMPreference
{
  private o dXi;
  private boolean ekQ = false;
  private ProgressDialog hqQ = null;

  private void a(LinearLayout paramLinearLayout, int paramInt, float paramFloat1, float paramFloat2, View.OnClickListener paramOnClickListener)
  {
    TextView localTextView = (TextView)View.inflate(aPI(), k.bkQ, null);
    localTextView.setText(paramInt);
    localTextView.setTextSize(1, SetTextSizeUI.ae(paramFloat1));
    localTextView.setTag(Float.valueOf(paramFloat1));
    paramLinearLayout.addView(localTextView);
    localTextView.setOnClickListener(paramOnClickListener);
    if (paramFloat1 == paramFloat2)
      localTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, h.ZL, 0);
  }

  private void a(LinearLayout paramLinearLayout, int paramInt1, int paramInt2, boolean paramBoolean, View.OnClickListener paramOnClickListener)
  {
    TextView localTextView = (TextView)View.inflate(aPI(), k.bkQ, null);
    localTextView.setText(paramInt1);
    localTextView.setTag(Integer.valueOf(paramInt2));
    paramLinearLayout.addView(localTextView);
    localTextView.setOnClickListener(paramOnClickListener);
    if (paramBoolean)
      localTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, h.ZL, 0);
  }

  private void aZg()
  {
    Preference localPreference = this.dXi.BU("settings_text_size");
    if (localPreference != null)
      localPreference.setSummary(getString(SetTextSizeUI.cC(this)));
    this.dXi.notifyDataSetChanged();
  }

  private void aZi()
  {
    int i = com.tencent.mm.sdk.platformtools.ch.a((Integer)bg.qW().oQ().get(327681), 1);
    int j;
    if ((1 == i) || (3 == i))
      j = n.cez;
    while (true)
    {
      Preference localPreference = this.dXi.BU("settings_auto_get_img");
      if ((localPreference != null) && (j != 0))
        localPreference.setSummary(getString(j));
      this.dXi.notifyDataSetChanged();
      return;
      if (2 == i)
      {
        j = n.cex;
      }
      else
      {
        j = 0;
        if (4 == i)
          j = n.cew;
      }
    }
  }

  protected final void DP()
  {
    oP(n.fIW);
    this.dXi = aTL();
    a(new cg(this));
  }

  public final int DZ()
  {
    return q.gPW;
  }

  public final boolean a(o paramo, Preference paramPreference)
  {
    String str = paramPreference.getKey();
    boolean bool6;
    if (str.equals("settings_voice_play_mode"))
    {
      boolean bool5 = ((Boolean)bg.qW().oQ().get(26, Boolean.valueOf(false))).booleanValue();
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = Boolean.valueOf(bool5);
      if (!bool5)
      {
        bool6 = true;
        arrayOfObject2[1] = Boolean.valueOf(bool6);
        z.d("!44@/B4Tb64lLpJkrm2DE1IrT0rq7ozlS8hfaamGM7cAkVA=", "set voice mode from %B to %B", arrayOfObject2);
        com.tencent.mm.storage.e locale = bg.qW().oQ();
        boolean bool7 = false;
        if (!bool5)
          bool7 = true;
        locale.set(26, Boolean.valueOf(bool7));
      }
    }
    CheckBoxPreference localCheckBoxPreference;
    do
    {
      return true;
      bool6 = false;
      break;
      if (!str.equals("settings_enter_button_send"))
        break label196;
      localCheckBoxPreference = (CheckBoxPreference)this.dXi.BU("settings_enter_button_send");
    }
    while (localCheckBoxPreference == null);
    boolean bool4 = localCheckBoxPreference.isChecked();
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Boolean.valueOf(bool4);
    z.d("!44@/B4Tb64lLpJkrm2DE1IrT0rq7ozlS8hfaamGM7cAkVA=", "set enter button send : %s", arrayOfObject1);
    bg.qW().oQ().set(66832, Boolean.valueOf(bool4));
    return true;
    label196: if (str.equals("settings_text_size"))
    {
      ad localad1 = new ad(aPI());
      localad1.e(n.bsK, null);
      localad1.BK(getString(n.che));
      View localView1 = View.inflate(aPI(), k.bim, null);
      localView1.findViewById(i.aSX).setVisibility(8);
      LinearLayout localLinearLayout1 = (LinearLayout)localView1.findViewById(i.aSn);
      float f = SetTextSizeUI.cB(aPI());
      cl localcl = new cl(this, localLinearLayout1, f);
      a(localLinearLayout1, n.ceG, 0.875F, f, localcl);
      a(localLinearLayout1, n.ceF, 1.0F, f, localcl);
      a(localLinearLayout1, n.ceE, 1.125F, f, localcl);
      a(localLinearLayout1, n.ceH, 1.25F, f, localcl);
      a(localLinearLayout1, n.ceD, 1.375F, f, localcl);
      localad1.ao(localView1);
      aa localaa1 = localad1.aRB();
      localLinearLayout1.setTag(localaa1);
      localaa1.show();
      a(localaa1);
      return true;
    }
    ad localad2;
    View localView2;
    LinearLayout localLinearLayout2;
    int i;
    if (str.equals("settings_auto_get_img"))
    {
      localad2 = new ad(aPI());
      localad2.e(n.bsK, null);
      localad2.pn(n.cfi);
      localView2 = View.inflate(aPI(), k.bim, null);
      localLinearLayout2 = (LinearLayout)localView2.findViewById(i.aSn);
      ((TextView)localView2.findViewById(i.aSX)).setText(n.cey);
      i = com.tencent.mm.sdk.platformtools.ch.a((Integer)bg.qW().oQ().get(327681), 1);
      if (3 != i)
        break label908;
    }
    label908: for (int j = 1; ; j = i)
    {
      cn localcn = new cn(this, localLinearLayout2, j);
      int k = n.cew;
      boolean bool1;
      boolean bool2;
      label584: int n;
      if (4 == j)
      {
        bool1 = true;
        a(localLinearLayout2, k, 4, bool1, localcn);
        int m = n.cez;
        if (1 != j)
          break label665;
        bool2 = true;
        a(localLinearLayout2, m, 1, bool2, localcn);
        n = n.cex;
        if (2 != j)
          break label671;
      }
      label665: label671: for (boolean bool3 = true; ; bool3 = false)
      {
        a(localLinearLayout2, n, 2, bool3, localcn);
        localad2.ao(localView2);
        aa localaa2 = localad2.aRB();
        localLinearLayout2.setTag(localaa2);
        localaa2.show();
        a(localaa2);
        return true;
        bool1 = false;
        break;
        bool2 = false;
        break label584;
      }
      if (str.equals("settings_bak_chat"))
      {
        int i1 = ((Integer)bg.qW().oQ().get(68416, new Integer(0))).intValue();
        Intent localIntent3 = new Intent().setClassName(aPI(), "com.tencent.mm.plugin.backup.ui.BakChatUI");
        localIntent3.putExtra("downloadUin", i1);
        a(new ck(this), localIntent3, 10000);
        return true;
      }
      if (str.equals("settings_chatting_bg"))
      {
        Intent localIntent1 = new Intent();
        localIntent1.setClass(this, SettingsChattingBackgroundUI.class);
        aPI().startActivity(localIntent1);
        return true;
      }
      if (str.equals("settings_emoji_manager"))
      {
        Intent localIntent2 = new Intent();
        localIntent2.putExtra("10931", 2);
        a.b(aPI(), "emoji", ".ui.EmojiMineUI", localIntent2);
        return true;
      }
      if (str.equals("settings_reset"))
      {
        com.tencent.mm.ui.base.e.a(aPI(), getResources().getString(n.cgM), "", getString(n.bsM), getString(n.bsK), new ch(this), null);
        return true;
      }
      return false;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    DP();
  }

  protected void onResume()
  {
    super.onResume();
    CheckBoxPreference localCheckBoxPreference1 = (CheckBoxPreference)this.dXi.BU("settings_voice_play_mode");
    if (localCheckBoxPreference1 != null)
    {
      localCheckBoxPreference1.setChecked(((Boolean)bg.qW().oQ().get(26, Boolean.valueOf(false))).booleanValue());
      localCheckBoxPreference1.aTS();
    }
    CheckBoxPreference localCheckBoxPreference2 = (CheckBoxPreference)this.dXi.BU("settings_enter_button_send");
    if (localCheckBoxPreference2 != null)
    {
      localCheckBoxPreference2.setChecked(((Boolean)bg.qW().oQ().get(66832, Boolean.valueOf(false))).booleanValue());
      localCheckBoxPreference2.aTS();
    }
    aZg();
    aZi();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.SettingsChattingUI
 * JD-Core Version:    0.6.2
 */