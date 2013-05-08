/*
 * Copyright (c) 2012, The President and Fellows of Harvard College.
 * All Rights Reserved.
 *
 *  Redistribution and use in source and binary forms, with or without
 *  modification, are permitted provided that the following conditions
 *  are met:
 *
 *  1. Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *  2. Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *  3. Neither the name of the University nor the names of its contributors
 *     may be used to endorse or promote products derived from this software
 *     without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE UNIVERSITY AND CONTRIBUTORS ``AS IS'' AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED.  IN NO EVENT SHALL THE UNIVERSITY OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS
 * OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
 * OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 */
package harvard.robobees.simbeeotic.model;


/**
 * An interface that defines a simple set of controls for the
 * testbed helicopters.
 *
 * @author bkate
 */
public interface HeliControl {

    /**
     * Gets the ID of the helicopter that is being controlled.
     *
     * @return The ID of the heli being controlled.
     */
    public int getHeliId();

    
    /**
     * Gets the currently set yaw command.
     *
     * @return The level that is currently set, as a value in the range (0,1)
     *         correspnding to the percentage of total possible output.
     */
    public double getYaw();


    /**
     * Gets the trim value (center value) for the yaw command on this helicopter.
     *
     * @return The trim value in the range (0,1).
     */
    public double getYawTrim();


    /**
     * Sets the yaw command to be executed by the heli.
     *
     * @param level A value in the range of (0,1) that corresponds to the
     *              percentage of the total possible output.
     */
    public void setYaw(double level);


    /**
     * Gets the currently set pitch command.
     *
     * @return The level that is currently set, as a value in the range (0,1)
     *         correspnding to the percentage of total possible output.
     */
    public double getPitch();


    /**
     * Gets the trim value (center value) for the pitch command on this helicopter.
     *
     * @return The trim value in the range (0,1).
     */
    public double getPitchTrim();


    /**
     * Sets the pitch command to be executed by the heli.
     *
     * @param level A value in the range of (0,1) that corresponds to the
     *              percentage of the total possible output.
     */
    public void setPitch(double level);


    /**
     * Gets the currently set roll command.
     *
     * @return The level that is currently set, as a value in the range (0,1)
     *         correspnding to the percentage of total possible output.
     */
    public double getRoll();


    /**
     * Gets the trim value (center value) for the roll command on this helicopter.
     *
     * @return The trim value in the range (0,1).
     */
    public double getRollTrim();


    /**
     * Sets the roll command to be executed by the heli.
     *
     * @param level A value in the range of (0,1) that corresponds to the
     *              percentage of the total possible output.
     */
    public void setRoll(double level);


    /**
     * Gets the currently set thrust command.
     *
     * @return The level that is currently set, as a value in the range (0,1)
     *         correspnding to the percentage of total possible output.
     */
    public double getThrust();


    /**
     * Gets the trim value (center value) for the thrust command on this helicopter.
     *
     * @return The trim value in the range (0,1).
     */
    public double getThrustTrim();


    /**
     * Sets the thrust command to be executed by the heli.
     *
     * @param level A value in the range of (0,1) that corresponds to the
     *              percentage of the total possible output.
     */
    public void setThrust(double level);

    public void sendCommands();

    public HeliDataStruct receiveData();
}
