package com.tencent.mm.ui.chatting;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.l;
import android.support.v4.app.v;
import android.support.v7.app.ActionBar;
import android.view.KeyEvent;
import android.view.Window;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.y;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMFragmentActivity;
import com.tencent.mm.ui.base.e;
import com.tencent.mm.ui.dz;

@SuppressLint({"DefaultLocale", "ValidFragment"})
@TargetApi(11)
public class ChattingUI extends MMFragmentActivity
{
  public dz jrD;

  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "chatting ui dispatch key event %s", new Object[] { paramKeyEvent });
    if ((this.jrD != null) && (this.jrD.onKeyDown(paramKeyEvent.getKeyCode(), paramKeyEvent)))
      return true;
    return super.dispatchKeyEvent(paramKeyEvent);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(null);
    getWindow().setFormat(-2);
    String str1 = getIntent().getStringExtra("Chat_User");
    if (str1 == null)
    {
      finish();
      z.e("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "talker is null !!");
    }
    String str2;
    do
    {
      return;
      setContentView(k.bdi);
      this.jrD = new hd((byte)0);
      this.jrD.setArguments(getIntent().getExtras());
      o().p().a(i.aEv, this.jrD).commit();
      aM().show();
      str2 = getIntent().getStringExtra("send_card_username");
    }
    while (ch.jb(str2));
    String str3 = y.dh(str2);
    boolean bool = getIntent().getBooleanExtra("Is_Chatroom", false);
    e.a(this, getString(n.cEa, new Object[] { str3 }), "", getString(n.buh), getString(n.bsK), new hc(this, str2, str1, bool), null);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    arrayOfObject[1] = paramKeyEvent;
    z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "chatting ui on key down, %d, %s", arrayOfObject);
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "chatting ui on key up");
    return super.onKeyUp(paramInt, paramKeyEvent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ChattingUI
 * JD-Core Version:    0.6.2
 */