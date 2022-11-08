//
//  FavoriteButton.swift
//  TutorialLandmarks
//
//  Created by haksung on 2022/11/07.
//

import SwiftUI

struct FavoriteButton: View {
    @Binding var isSet: Bool
    @EnvironmentObject var modelData: ModelData
    var landmark: Landmark
    var landmarkIndex: Int {
        modelData.landmarks.firstIndex(where: { $0.id == landmark.id })!
    }
    
    var body: some View {
        Button {
            isSet.toggle()
            putLandmark(paramText:
                            modelData.landmarks[landmarkIndex])
        } label: {
            Label("Toggle Favorite", systemImage: isSet ? "star.fill" : "star")
                .labelStyle(.iconOnly)
                .foregroundColor(isSet ? .yellow : .gray)
        }
    }
    
}

struct FavoriteButton_Previews: PreviewProvider {
    static let modelData = ModelData()
    
    static var previews: some View {
        FavoriteButton(isSet: .constant(true), landmark: modelData.landmarks[0])
    }
}
