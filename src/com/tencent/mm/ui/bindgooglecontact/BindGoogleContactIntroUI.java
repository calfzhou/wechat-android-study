package com.tencent.mm.ui.bindgooglecontact;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMActivity;

public class BindGoogleContactIntroUI extends MMActivity
  implements m
{
  private ProgressDialog eyO;
  private ImageView jhW;
  private TextView jhX;
  private Button jhY;
  private Button jhZ;
  private boolean jia = false;
  private boolean jib = false;
  private String jic;
  private com.tencent.mm.x.a jid;
  private int jie;
  private View.OnClickListener jif = new a(this);
  private View.OnClickListener jig = new b(this);

  private void aTT()
  {
    this.jhZ.setVisibility(8);
    this.jhY.setVisibility(0);
    this.jhW.setVisibility(0);
    this.jhX.setVisibility(0);
    this.jhX.setText(n.bvZ);
    this.jhY.setText(n.bvX);
    this.jhY.setOnClickListener(this.jif);
  }

  protected final void DP()
  {
    a(new e(this));
    this.jhW = ((ImageView)findViewById(i.aOK));
    this.jhX = ((TextView)findViewById(i.aOL));
    this.jhY = ((Button)findViewById(i.aOJ));
    this.jhZ = ((Button)findViewById(i.aPd));
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(paramInt1);
    arrayOfObject[1] = Integer.valueOf(paramInt2);
    if (TextUtils.isEmpty(paramString))
      paramString = "";
    arrayOfObject[2] = paramString;
    z.i("!64@/B4Tb64lLpKHrGLZvbPyiE8eKM9hrTovnMB6ms+nCtpDKu2axzhXBpE9XXpT6K0t", "[onSceneEnd] errType:%d,errCode:%d,errMsg:%s", arrayOfObject);
    if ((this.eyO != null) && (this.eyO.isShowing()))
      this.eyO.dismiss();
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      bg.qW().oQ().set(208903, "");
      bg.qW().oQ().set(208901, "");
      bg.qW().oQ().set(208902, "");
      bg.qW().oQ().set(208905, Boolean.valueOf(true));
      aTT();
      com.tencent.mm.ui.base.e.aw(this, getString(n.cmL));
      return;
    }
    z.i("!64@/B4Tb64lLpKHrGLZvbPyiE8eKM9hrTovnMB6ms+nCtpDKu2axzhXBpE9XXpT6K0t", "unbind failed");
    Toast.makeText(this, n.bMZ, 0).show();
  }

  protected final int getLayoutId()
  {
    return k.bbE;
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(paramInt1);
    arrayOfObject[1] = Integer.valueOf(paramInt2);
    z.i("!64@/B4Tb64lLpKHrGLZvbPyiE8eKM9hrTovnMB6ms+nCtpDKu2axzhXBpE9XXpT6K0t", "requestCode:%d, resultCode:%d", arrayOfObject);
    if (paramInt2 == -1)
      if (paramInt1 == 2005)
        this.jia = paramIntent.getBooleanExtra("gpservices", false);
    while (paramInt1 != 2005)
      return;
    this.jia = paramIntent.getBooleanExtra("gpservices", false);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    oP(n.bwa);
    this.jie = getIntent().getIntExtra("enter_scene", 0);
    this.jia = com.tencent.mm.modelfriend.ac.A(this);
    if (this.jia)
      startActivityForResult(new Intent("com.tencent.mm.gms.CHECK_GP_SERVICES"), 2005);
  }

  protected void onDestroy()
  {
    super.onDestroy();
  }

  protected void onResume()
  {
    super.onResume();
    this.jic = ((String)bg.qW().oQ().get(208903));
    if (TextUtils.isEmpty(this.jic))
    {
      this.jib = false;
      DP();
      if (!this.jib)
        break label134;
      this.jhZ.setVisibility(0);
      this.jhY.setVisibility(8);
      this.jhX.setVisibility(0);
      TextView localTextView = this.jhX;
      int i = n.bvY;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = this.jic;
      localTextView.setText(getString(i, arrayOfObject));
      this.jhZ.setOnClickListener(this.jig);
    }
    while (true)
    {
      bg.qX().a(487, this);
      return;
      this.jib = true;
      break;
      label134: aTT();
    }
  }

  protected void onStop()
  {
    super.onStop();
    bg.qX().b(487, this);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindgooglecontact.BindGoogleContactIntroUI
 * JD-Core Version:    0.6.2
 */