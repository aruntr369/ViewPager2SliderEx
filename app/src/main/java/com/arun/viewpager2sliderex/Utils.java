package com.arun.viewpager2sliderex;

import android.annotation.SuppressLint;

import androidx.viewpager2.widget.ViewPager2;

import com.arun.viewpager2sliderex.transformers.AntiClockSpinTransformation;
import com.arun.viewpager2sliderex.transformers.ClockSpinTransformation;
import com.arun.viewpager2sliderex.transformers.CubeInDepthTransformation;
import com.arun.viewpager2sliderex.transformers.CubeInRotationTransformation;
import com.arun.viewpager2sliderex.transformers.CubeOutDepthTransformation;
import com.arun.viewpager2sliderex.transformers.CubeOutRotationTransformation;
import com.arun.viewpager2sliderex.transformers.CubeOutScalingTransformation;
import com.arun.viewpager2sliderex.transformers.DepthPageTransformer;
import com.arun.viewpager2sliderex.transformers.DepthTransformation;
import com.arun.viewpager2sliderex.transformers.FadeOutTransformation;
import com.arun.viewpager2sliderex.transformers.FanTransformation;
import com.arun.viewpager2sliderex.transformers.GateTransformation;
import com.arun.viewpager2sliderex.transformers.HingeTransformation;
import com.arun.viewpager2sliderex.transformers.HorizontalFlipTransformation;
import com.arun.viewpager2sliderex.transformers.PopTransformation;
import com.arun.viewpager2sliderex.transformers.SimpleTransformation;
import com.arun.viewpager2sliderex.transformers.SpinnerTransformation;
import com.arun.viewpager2sliderex.transformers.TossTransformation;
import com.arun.viewpager2sliderex.transformers.VerticalFlipTransformation;
import com.arun.viewpager2sliderex.transformers.VerticalShutTransformation;
import com.arun.viewpager2sliderex.transformers.ZoomOutPageTransformer;


public class Utils {
    @SuppressLint("NewApi")
    public static ViewPager2.PageTransformer getTransformer(int id) {
        switch (id) {
            case R.id.action_anti_clock_spin:
                return new AntiClockSpinTransformation();
            case R.id.action_clock_spin:
                return new ClockSpinTransformation();
            case R.id.action_cube_in_depth:
                return new CubeInDepthTransformation();
            case R.id.action_cube_in_rotate:
                return new CubeInRotationTransformation();
            case R.id.action_cube_out_depth:
                return new CubeOutDepthTransformation();
            case R.id.action_cube_out_rotate:
                return new CubeOutRotationTransformation();
            case R.id.action_cube_out_scaling:
                return new CubeOutScalingTransformation();
            case R.id.action_depth_page:
                return new DepthPageTransformer();
            case R.id.action_depth:
                return new DepthTransformation();
            case R.id.action_fade_out:
                return new FadeOutTransformation();
            case R.id.action_fan:
                return new FanTransformation();
            case R.id.action_gate:
                return new GateTransformation();
            case R.id.action_hinge:
                return new HingeTransformation();
            case R.id.action_horizontal_flip:
                return new VerticalFlipTransformation();
            case R.id.action_pop:
                return new PopTransformation();
            case R.id.action_simple_transformation:
                return new SimpleTransformation();
            case R.id.action_spinner:
                return new SpinnerTransformation();
            case R.id.action_toss:
                return new TossTransformation();
            case R.id.action_vertical_flip:
                return new HorizontalFlipTransformation();
            case R.id.action_vertical_shut:
                return new VerticalShutTransformation();
            case R.id.action_zoom_out:
                return new ZoomOutPageTransformer();
        }

        return null;
    }
}
