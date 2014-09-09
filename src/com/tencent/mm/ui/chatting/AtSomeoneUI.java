package com.tencent.mm.ui.chatting;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.c;
import com.tencent.mm.storage.cj;
import com.tencent.mm.storage.cl;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.tools.fj;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class AtSomeoneUI extends MMActivity
{
  private String cEh;
  private com.tencent.mm.storage.b euc;
  private ListView fRC;
  private fj fqB;
  private String jmA;
  private String jmB;
  private ad jmz;

  protected static String a(com.tencent.mm.storage.b paramb, String paramString)
  {
    if (paramb == null);
    while (!paramb.aId())
      return null;
    return paramb.dh(paramString);
  }

  protected final void DP()
  {
    oP(n.caj);
    a(new aa(this));
    this.fqB = new fj(true, true);
    this.fqB.a(new ab(this));
    a(this.fqB);
    this.fRC = ((ListView)findViewById(com.tencent.mm.i.akL));
    com.tencent.mm.storage.i locali = new com.tencent.mm.storage.i();
    com.tencent.mm.storage.b localb = this.euc;
    boolean bool = ap.jb(this.jmB);
    String[] arrayOfString = null;
    if (!bool)
    {
      arrayOfString = this.jmB.split(",");
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Arrays.toString(arrayOfString);
      z.d("!32@/B4Tb64lLpLK7Qt9yZ/QZPm4pyiTa6j+", "chatroom members name=[%s]", arrayOfObject);
    }
    Object localObject = new LinkedList();
    if (!ap.jb(this.jmA))
      localObject = ap.b(this.jmA.split(","));
    cj localcj = bg.qW().oY().zX("@t.qq.com");
    if (localcj != null)
      ((List)localObject).add(localcj.getName());
    this.jmz = new ad(this, locali, localb, arrayOfString, (List)localObject);
    this.fRC.setOnItemClickListener(new ac(this));
    this.fRC.setAdapter(this.jmz);
  }

  protected final int getLayoutId()
  {
    return k.bbb;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.jmA = getIntent().getStringExtra("Block_list");
    this.jmB = getIntent().getStringExtra("Chatroom_member_list");
    this.cEh = getIntent().getStringExtra("Chat_User");
    this.euc = bg.qW().oZ().xS(this.cEh);
    DP();
  }

  protected void onDestroy()
  {
    this.jmz.closeCursor();
    super.onDestroy();
  }

  protected void onPause()
  {
    super.onPause();
    if (this.fqB != null)
      this.fqB.baN();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.AtSomeoneUI
 * JD-Core Version:    0.6.2
 */