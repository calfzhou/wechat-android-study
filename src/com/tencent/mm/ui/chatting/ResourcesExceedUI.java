package com.tencent.mm.ui.chatting;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.n;
import com.tencent.mm.ui.MMActivity;

public class ResourcesExceedUI extends MMActivity
{
  private TextView jvo;
  private int type = 0;

  protected final void DP()
  {
    a(new mz(this));
    this.jvo = ((TextView)findViewById(i.aqd));
    switch (this.type)
    {
    default:
      return;
    case 0:
      this.jvo.setText(n.cnU);
      return;
    case 2:
      this.jvo.setText(n.bIX);
      return;
    case 1:
    }
    this.jvo.setText(n.bOT);
  }

  protected final int getLayoutId()
  {
    return k.blL;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.type = getIntent().getIntExtra("clean_view_type", 0);
    Bt("");
    DP();
  }

  public void onDestroy()
  {
    super.onDestroy();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ResourcesExceedUI
 * JD-Core Version:    0.6.2
 */