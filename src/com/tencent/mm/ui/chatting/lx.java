package com.tencent.mm.ui.chatting;

import android.content.ContentResolver;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.provider.Settings.Secure;
import android.support.v4.app.FragmentActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ImageView;
import com.tencent.mm.g;
import com.tencent.mm.model.v;
import com.tencent.mm.model.x;
import com.tencent.mm.n;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.r;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.ai;
import com.tencent.mm.ui.base.aa;
import com.tencent.mm.ui.base.e;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

final class lx
  implements TextWatcher
{
  private boolean juq = false;
  private List jur = null;

  private lx(hd paramhd)
  {
  }

  private static void d(List paramList, String[] paramArrayOfString)
  {
    int i = paramArrayOfString.length;
    for (int j = 0; j < i; j++)
    {
      String str = paramArrayOfString[j];
      if ((str.length() > 0) && (str.substring(-1 + str.length(), str.length()).matches("[_0-9a-zA-Z]$")))
        paramList.add(str);
    }
  }

  public final void afterTextChanged(Editable paramEditable)
  {
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    z.i("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "[onTextChanged]");
    String str1 = String.valueOf(paramCharSequence);
    String str2 = str1.substring(paramInt1, paramInt1 + paramInt3);
    int j;
    if ((this.jtA.jom) && ("@".equals(str2)) && (!str1.equals(this.jtA.fpD.aBR())) && (!this.jtA.fpD.aBP()))
    {
      this.jtA.fpD.vC(str1);
      this.jtA.fpD.mO(paramInt1 + 1);
      if ((str1 == null) || (paramInt1 < 0) || (str1.length() <= paramInt1))
      {
        j = 0;
        if (j != 0)
        {
          String str5 = ch.a(v.cU(this.jtA.aUL()), ",");
          Intent localIntent = new Intent();
          localIntent.setClass(this.jtA.agh(), AtSomeoneUI.class);
          localIntent.putExtra("Block_list", x.pG());
          localIntent.putExtra("Chatroom_member_list", str5);
          localIntent.putExtra("Chat_User", this.jtA.jnf.getUsername());
          this.jtA.startActivityForResult(localIntent, 212);
        }
      }
    }
    ContentResolver localContentResolver;
    boolean bool;
    while (true)
      if (((hd.aj(this.jtA) == null) || (!hd.aj(this.jtA).isShowing())) && (!ch.jb(str2)) && (ch.xx(str2)))
      {
        if (this.jtA.jon)
          break label712;
        Bitmap localBitmap = com.tencent.mm.sdk.platformtools.i.a(str2, 300, 300, false);
        if (localBitmap == null)
        {
          z.e("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "showAlert fail, bmp is null");
          return;
          String str6;
          Iterator localIterator;
          if ((paramInt1 != 0) && (str1.substring(paramInt1 - 1, paramInt1).matches("[_0-9a-zA-Z]$")))
          {
            if (this.jur == null)
            {
              this.jur = new LinkedList();
              String[] arrayOfString1 = this.jtA.getResources().getStringArray(com.tencent.mm.c.Np);
              d(this.jur, arrayOfString1);
              String[] arrayOfString2 = this.jtA.getResources().getStringArray(com.tencent.mm.c.adR);
              d(this.jur, arrayOfString2);
            }
            str6 = str1.substring(0, paramInt1);
            localIterator = this.jur.iterator();
          }
          while (true)
            if (localIterator.hasNext())
              if (str6.endsWith((String)localIterator.next()))
              {
                j = 1;
                break;
              }
          j = 0;
          break;
          if (str1.equals(this.jtA.fpD.aBR()))
            continue;
          this.jtA.fpD.vC(str1);
          continue;
        }
        ImageView localImageView = new ImageView(this.jtA.agh());
        int i = this.jtA.getResources().getDimensionPixelSize(g.PA);
        localImageView.setImageBitmap(localBitmap);
        localImageView.setPadding(i, i, i, i);
        hd localhd = this.jtA;
        if (localhd.h() == null)
          break label700;
        localContentResolver = localhd.h().getContentResolver();
        String str4 = Settings.Secure.getString(localContentResolver, "default_input_method");
        if ((!r.cP(com.tencent.mm.a.c.a(str2, 0, com.tencent.mm.a.c.ab(str2)))) || (!str4.contains("com.sohu.inputmethod.sogou")))
          break label706;
        bool = true;
        label591: hd.a(this.jtA, e.a(this.jtA.agh(), this.jtA.getString(n.bAh), localImageView, this.jtA.getString(n.btQ), this.jtA.getString(n.bsK), new ly(this, bool, str2), null));
      }
    while (true)
    {
      String str3 = str1.substring(0, paramInt1);
      this.jtA.fpD.postDelayed(new lz(this, str3), 10L);
      this.jtA.fpD.vF(str1);
      return;
      label700: localContentResolver = null;
      break;
      label706: bool = false;
      break label591;
      label712: hd.a(this.jtA, e.o(this.jtA.agh(), this.jtA.getString(n.bzu), this.jtA.getString(n.btQ)));
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.lx
 * JD-Core Version:    0.6.2
 */