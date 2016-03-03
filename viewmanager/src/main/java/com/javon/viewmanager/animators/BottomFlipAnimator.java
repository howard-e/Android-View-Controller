//package com.javon.viewmanager.animators;
//
//import android.animation.Animator;
//import android.animation.AnimatorListenerAdapter;
//import android.os.Handler;
//import android.view.View;
//import android.view.animation.AccelerateInterpolator;
//import android.view.animation.Animation;
//
///**
// * Class to change one view to the next through a flip animation at the bottom
// * @author Howard Edwards
// */
//public class BottomFlipAnimator extends ControllerAnimator {
//
//    public BottomFlipAnimator() {
//        super();
//    }
//
//    public BottomFlipAnimator(View oldView, View newView)
//    {
//        super(oldView,newView);
//    }
//
//    @Override
//    public void onAnimationStart(Animation animation) {
//        final View oldView = getOldView();
//        final View newView = getNewView();
//
//        newView.setRotationX(-90);
//
//        Handler mHandler = new Handler();
//
//        //clearing the listener is important as it would cause an infinite
//        // loop in onAnimationEnd due to the ViewPropertyAnimator in the map created
//        oldView.animate().setListener(null).rotationXBy(90).setInterpolator
//                (new AccelerateInterpolator()).setListener(new AnimatorListenerAdapter() {
//            @Override
//            public void onAnimationEnd(Animator animation) {
//                newView.setVisibility(View.VISIBLE);
//                oldView.setVisibility(View.GONE);
//
//                //remember to clear the listener
//                newView.animate().setListener(null).rotationXBy(90).setDuration(getDuration());
//                oldView.setRotationX(0);
//            }
//        }).setDuration(getDuration());
//    }
//
//    @Override
//    public void onAnimationEnd(Animation animation) {
//
//    }
//
//    @Override
//    public void onAnimationRepeat(Animation animation) {
//
//    }
//}
