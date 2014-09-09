package com.tencent.mm.ui.pluginapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import com.tencent.mm.n;
import com.tencent.mm.n.af;
import com.tencent.mm.n.e;
import com.tencent.mm.protocal.a.xb;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.applet.a;
import java.io.IOException;
import java.util.LinkedList;

public class ContactSearchResultUI extends MMActivity
{
  private LinkedList dRV = new LinkedList();
  private ListView jKE;
  private k jKF;

  protected final void DP()
  {
    oP(n.bdQ);
    a(new h(this));
    this.jKE = ((ListView)findViewById(com.tencent.mm.i.aMk));
    byte[] arrayOfByte = getIntent().getByteArrayExtra("result");
    int i = getIntent().getIntExtra("add_more_friend_search_scene", 0);
    if (arrayOfByte != null);
    try
    {
      xb localxb = new xb().cn(arrayOfByte);
      if (localxb != null)
        this.dRV = localxb.ibL;
      label85: if ((this.dRV == null) || (this.dRV.size() == 0))
        return;
      this.jKF = new k(this, this);
      this.jKE.setAdapter(this.jKF);
      this.jKE.setOnItemClickListener(new i(this, i));
      this.jKE.setOnScrollListener(new a());
      this.jKE.setOnTouchListener(new j(this));
      return;
    }
    catch (IOException localIOException)
    {
      break label85;
    }
  }

  protected final int getLayoutId()
  {
    return com.tencent.mm.k.bdQ;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    DP();
  }

  protected void onDestroy()
  {
    af.sL().cancel();
    if (this.jKF != null)
      this.jKF.detach();
    super.onDestroy();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.pluginapp.ContactSearchResultUI
 * JD-Core Version:    0.6.2
 */