EXPECTED_BAKE_TIME = 40

def bake_time_remaining(time_in_oven):
    """
    Calculates remaining time
    """
    remaining = EXPECTED_BAKE_TIME - time_in_oven
    return remaining

def preparation_time_in_minutes(num_of_layers):
    """
    Calculates preparation in minutes
    """
    minutesRemanining = num_of_layers * 2
    return minutesRemanining

def elapsed_time_in_minutes(number_of_layers, elapsed_bake_time):
    """Calculate the elapsed cooking time.

    :param number_of_layers: int - the number of layers in the lasagna.
    :param elapsed_bake_time: int - elapsed cooking time.
    :return: int - total time elapsed (in minutes) preparing and cooking.

    This function takes two integers representing the number of lasagna layers and the
    time already spent baking and calculates the total elapsed minutes spent cooking the
    lasagna.
    """
    totalMinutes = (number_of_layers * 2) + elapsed_bake_time
    return totalMinutes
    
    


